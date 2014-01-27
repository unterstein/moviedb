package neo4j.services;

import neo4jplugin.Neo4JPlugin;
import neo4jplugin.ServiceProvider;
import org.springframework.stereotype.Component;

@Component
public class Neo4JServiceProvider extends ServiceProvider {

//  @Autowired
//  public NeoUserRepository neoUserRepository;

  public static Neo4JServiceProvider get() {
    return Neo4JPlugin.get();
  }
}

