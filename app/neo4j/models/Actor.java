package neo4j.models;

import neo4j.relations.Relations;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import java.util.Set;

@NodeEntity
public class Actor extends AbstractModel {

  public String name;

  @RelatedTo(type = Relations.ACTOR_MOVIE)
  public Set<Movie> movies;
}
