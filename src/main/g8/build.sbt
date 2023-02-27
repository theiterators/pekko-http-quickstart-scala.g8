// Run in a separate JVM, to make sure sbt waits until all threads have
// finished before returning.
// If you want to keep the application running while executing other
// sbt tasks, consider https://github.com/spray/sbt-revolver/
fork := true

resolvers += "Apache Snapshots" at "https://repository.apache.org/content/repositories/snapshots/"

lazy val root = (project in file(".")).settings(
  inThisBuild(List(organization := "$organization$", scalaVersion := "$scala_version$")),
  name := "$name$",
  libraryDependencies ++= {
    val pekkoV     = "$pekko_version$"
    val pekkoHttpV = "$pekko_http_version$"
    val logbackV   = "1.4.5"
    val scalatestV = "3.2.15"
    Seq(
      "org.apache.pekko" %% "pekko-http"                % pekkoHttpV,
      "org.apache.pekko" %% "pekko-http-spray-json"     % pekkoHttpV,
      "org.apache.pekko" %% "pekko-actor-typed"         % pekkoV,
      "org.apache.pekko" %% "pekko-stream"              % pekkoV,
      "ch.qos.logback"    % "logback-classic"           % logbackV,
      "org.apache.pekko" %% "pekko-http-testkit"        % pekkoHttpV % Test,
      "org.apache.pekko" %% "pekko-actor-testkit-typed" % pekkoV     % Test,
      "org.scalatest"    %% "scalatest"                 % scalatestV % Test
    )
  }
)
