import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"
  lazy val breeze = "org.scalanlp" %% "breeze" % "0.13.2"
  lazy val breezeNatives = "org.scalanlp" %% "breeze-natives" % "0.13.2"
  lazy val logging = Seq("org.slf4j" % "slf4j-api" % "1.7.5", "org.slf4j" % "slf4j-simple" % "1.7.5")
  lazy val spark = "org.apache.spark" % "spark-core_2.11" % "2.2.0"
}
