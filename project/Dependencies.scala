import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"
  lazy val breeze = "org.scalanlp" %% "breeze" % "0.13"
  lazy val breezeNatives = "org.scalanlp" %% "breeze-natives" % "0.13"
  lazy val breezeViz = "org.scalanlp" %% "breeze-viz" % "0.13"
  lazy val epic = "org.scalanlp" %% "epic"  % "0.4.4"
  lazy val logging = Seq("org.slf4j" % "slf4j-api" % "1.7.5",
    "org.slf4j" % "slf4j-simple" % "1.7.5")
}
