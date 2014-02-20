import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "moviedb"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.github.tuxBurner" %% "play-neo4jplugin" % "1.3.3"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "tuxburner.github.io" at "http://tuxburner.github.io/repo",
    resolvers += "Neo4j" at "http://m2.neo4j.org/content/repositories/releases/",
    resolvers += "Spring milestones" at "http://repo.spring.io/milestone"
  )

}
