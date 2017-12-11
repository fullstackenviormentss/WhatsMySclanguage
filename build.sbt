import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.6",
      version      := "0.1.0-SNAPSHOT",
      resolvers ++= Seq(
        // other resolvers here
        // if you want to use snapshot builds (currently 0.12-SNAPSHOT), use this.
        "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
        "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
      )
    )),
    name := "WhatsMySclanguage",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += breeze,
    libraryDependencies += breezeNatives,
    libraryDependencies += breezeViz,
    libraryDependencies += epic
//    libraryDependencies += epicParserEn,

  )
