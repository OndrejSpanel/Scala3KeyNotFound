ThisBuild / version := "0.1.0-SNAPSHOT"

//ThisBuild / scalaVersion := "3.3.1"
ThisBuild / scalaVersion := "3.4.1-RC1-bin-20240130-7a5cb6e-NIGHTLY"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies += "org.wvlet.airframe" %% "airframe-surface" % "24.1.1",
    name := "Scala3KeyNotFound"
  )
