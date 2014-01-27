package controllers;

import neo4j.services.Neo4JServiceProvider;
import neo4jplugin.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

  @Transactional
  public static Result index() {
    return ok(index.render(Neo4JServiceProvider.get().actorRepository.findAll().iterator()));
  }

}
