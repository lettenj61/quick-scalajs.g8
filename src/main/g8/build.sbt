enablePlugins(ScalaJSPlugin)

lazy val scalaV = "$scalaVersion$"

// Project information
scalaVersion  := scalaV
organization  := "$organization$"
version       := "0.1.0-SNAPSHOT"
name          := "$name$"
description   := "$description$"

scalacOptions in Compile ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  // "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import",
  "-Ywarn-unused",
  "-P:scalajs:sjsDefinedByDefault"
)

scalaJSLinkerConfig ~= { lc =>
  lc.withSourceMap(false)
    .withModuleKind(ModuleKind.CommonJSModule)
}

// Uncomment when you need `main` method
// scalaJSUseMainModuleInitializer := true
// mainClass in Compile := Some("com.example.Main")

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.5" % "test"

// -- utest
/*
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.1" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
*/
