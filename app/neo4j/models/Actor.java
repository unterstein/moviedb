package neo4j.models;

import neo4j.relations.Relations;
import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Set;

@NodeEntity
@TypeAlias("Actor")
public class Actor extends AbstractModel {

  public String name;

  @RelatedTo(type = Relations.ACTOR_MOVIE, direction = Direction.BOTH)
  public Set<Movie> movies;
}
