import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "WhatsMySclanguage",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += breeze,
    libraryDependencies += breezeNatives,
    libraryDependencies ++= logging
  )
