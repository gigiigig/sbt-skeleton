scalaVersion := "2.11.6"

resolvers ++= Seq(
  "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.1.0",
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "org.scalaz" %% "scalaz-effect" % "7.1.0",
  "org.scalaz" %% "scalaz-concurrent" % "7.1.0",
  "org.scalaz.stream" %% "scalaz-stream" % "0.7a",
  "com.typesafe.akka" %% "akka-stream-experimental" % "0.9",
  "org.scalaz.stream" %% "scalaz-stream" % "0.7a"
)

transitiveClassifiers := Seq("sources", "javadoc")

initialCommands in console := 
  """
  import scalaz._
  import Scalaz._
  import shapeless._
  """


