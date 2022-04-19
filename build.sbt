name := """TravelFix"""

version := "1.0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaWs,
  cache,
  filters,
  evolutions,
  specs2 % Test,
//  "com.typesafe.akka" %% "akka-actor" % "2.4.1",
  "com.jason-goodwin" %% "authentikat-jwt" % "0.3.5",
  "mysql" % "mysql-connector-java" % "5.1.27",
  "org.postgresql" % "postgresql" % "9.4-1204-jdbc42",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.typesafe.play" %% "play-mailer" % "3.0.1",
  "com.restfb" % "restfb" % "1.13.0",
  "com.lowagie" % "itext" % "4.2.2",
  "commons-io" % "commons-io" % "2.4",
  "com.google.inject" % "guice-parent" % "3.0",
  "org.apache.commons" % "commons-csv" % "1.2",
  "jdom" % "jdom" % "1.1",
  "com.dropbox.core" % "dropbox-core-sdk" % "2.0-beta-5",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.10.61",
  "com.google.code.gson" % "gson" % "2.6.2"
)

resolvers ++= Seq(
  "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/",
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Apache" at "http://repo1.maven.org/maven2/",
  "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
  "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
//routesGenerator := InjectedRoutesGenerator
