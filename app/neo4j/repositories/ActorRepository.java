package neo4j.repositories;

import neo4j.models.Actor;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

public interface ActorRepository extends GraphRepository<Actor> {

  List<Actor> findByName(String name);
}
