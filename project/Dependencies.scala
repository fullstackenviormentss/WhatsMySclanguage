import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"
  lazy val breeze = "org.scalanlp" %% "breeze" % "0.13.2"
  lazy val breezeNatives = "org.scalanlp" %% "breeze-natives" % "0.13.2"
  lazy val epic = "org.scalanlp" %% "epic" % "0.2"
  lazy val epicParserEn = "org.scalanlp" %% "epic-parser-en-span" % "2014.9.15"
}
