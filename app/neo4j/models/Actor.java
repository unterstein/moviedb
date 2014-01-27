package neo4j.models;

import neo4j.relations.Relations;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Set;

@NodeEntity
@TypeAlias("Actor")
public class Actor extends AbstractModel {

  public String name;

  @Fetch
  @RelatedTo(type = Relations.ACTOR_MOVIE)
  public Set<Movie> movies;
}
