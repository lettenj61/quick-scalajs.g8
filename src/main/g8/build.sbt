enablePlugins(ScalaJSPlugin)
// enablePlugins(ScalaJSBundlerPlugin)

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

// -- scalajs-bundler
/*
version in webpack := "4.28.4"
version in startWebpackDevServer := "3.1.14"
useYarn := true
emitSourceMaps := false
requireJsDomEnv in Test := true
*/

scalaJSLinkerConfig ~= { cf =>
  cf.withSourceMap(false)
    .withModuleKind(ModuleKind.CommonJSModule)
}

// Uncomment when you need `main` method
// scalaJSUseMainModuleInitializer := true
// mainClass in Compile := Some("com.example.Main")

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.5" % "test"

// -- utest
/*
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.6" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
*/
