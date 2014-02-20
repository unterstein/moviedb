package neo4j.repositories;

import neo4j.models.Actor;
import neo4j.models.Movie;
import neo4j.relations.Relations;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.annotation.QueryResult;
import org.springframework.data.neo4j.annotation.ResultColumn;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface ActorRepository extends GraphRepository<Actor> {

  List<Actor> findByName(String name);

  @Query("MATCH (actor: Actor)-[:" + Relations.ACTOR_MOVIE + "]-movie RETURN actor.name as name, collect(movie.name) as movies")
  List<LightActor> findLightActors();

  @QueryResult
  public interface LightActor {

    @ResultColumn("name")
    String getName();

    @ResultColumn("movies")
    Iterable<String> getMovies();
  }
}
