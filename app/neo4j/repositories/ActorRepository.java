package neo4j.repositories;

import neo4j.models.Movie;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ActorRepository extends GraphRepository<Movie> {

}
