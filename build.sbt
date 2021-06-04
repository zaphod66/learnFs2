import Dependencies._

ThisBuild / scalaVersion     := "2.13.5"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

name := "learnFs2"
addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.0" cross CrossVersion.full)
addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")

libraryDependencies += scalaTest % Test

libraryDependencies += "co.fs2" %% "fs2-core" % "3.0.0"
libraryDependencies += "co.fs2" %% "fs2-io" % "3.0.0"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.6.1"
libraryDependencies += "org.typelevel" %% "cats-free" % "2.6.1"

libraryDependencies += "org.typelevel" %% "cats-effect" % "3.1.1"
libraryDependencies += "org.typelevel" %% "cats-effect-laws" % "3.1.1"

ThisBuild / scalacOptions ++= Seq("-feature", "-deprecation")

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
