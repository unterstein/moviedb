package controllers;

import neo4j.services.Neo4JServiceProvider;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render(Neo4JServiceProvider.get().actorRepository.findAll().iterator()));
    }
  
}
