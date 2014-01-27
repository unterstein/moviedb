import neo4j.models.Actor;
import neo4j.models.Movie;
import neo4j.services.Neo4JServiceProvider;
import play.Application;
import play.GlobalSettings;

import java.util.HashSet;

public class Global extends GlobalSettings {

  @Override
  public void onStart(Application application) {
    if (Neo4JServiceProvider.get().actorRepository.findByName("Keanu Reeves").size() == 0) {
      initialData();
    }
  }

  private void initialData() {
    Actor keanu = new Actor();
    keanu.name = "Keanu Reeves";
    keanu.movies = new HashSet<Movie>();
    keanu.movies.add(createMovie("John Wick"));
    keanu.movies.add(createMovie("47 Ronin"));
    keanu.movies.add(createMovie("Man of Tai Chi"));
    keanu.movies.add(createMovie("Side by Side"));
    keanu.movies.add(createMovie("Generation Um..."));
    keanu.movies.add(createMovie("Henry's Crime"));
    keanu.movies.add(createMovie("The Private Lives of Pippa Lee"));
    keanu.movies.add(createMovie("The Day the Earth Stood Still"));
    keanu.movies.add(createMovie("Street Kings"));
    keanu.movies.add(createMovie("The Great Warming"));
    keanu.movies.add(createMovie("A Scanner Darkly"));
    keanu.movies.add(createMovie("The Lake House"));
    keanu.movies.add(createMovie("Ellie Parker"));
    keanu.movies.add(createMovie("Thumbsucker"));
    keanu.movies.add(createMovie("Constantine"));
    keanu.movies.add(createMovie("Something's Gotta Give"));
    keanu.movies.add(createMovie("The Matrix Revolutions"));
    keanu.movies.add(createMovie("The Animatrix"));
    keanu.movies.add(createMovie("The Matrix Reloaded"));
    keanu.movies.add(createMovie("Hardball"));
    keanu.movies.add(createMovie("Sweet November"));
    keanu.movies.add(createMovie("The Gift"));
    keanu.movies.add(createMovie("The Watcher"));
    keanu.movies.add(createMovie("The Replacements"));
    keanu.movies.add(createMovie("Me and Will"));
    keanu.movies.add(createMovie("The Matrix"));
    Neo4JServiceProvider.get().actorRepository.save(keanu);
  }

  private Movie createMovie(String name) {
    Movie movie = new Movie();
    movie.name = name;
    return movie;
  }
}
