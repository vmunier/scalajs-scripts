import bintray.Keys._

name := "play-scalajs-scripts"

version := "0.3.0"

organization := "com.vmunier"

homepage := Some(url("https://github.com/vmunier/play-scalajs-scripts"))

crossScalaVersions := Seq("2.10.4", "2.11.6")

enablePlugins(SbtTwirl)

// play.api.Play is needed
libraryDependencies += "com.typesafe.play" %% "play" % "2.4.0"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

pomExtra := (
  <scm>
    <url>git@github.com:vmunier/play-scalajs-scripts.git</url>
    <connection>scm:git:git@github.com:vmunier/play-scalajs-scripts.git</connection>
  </scm>
  <developers>
    <developer>
      <id>vmunier</id>
      <name>Vincent Munier</name>
      <url>https://github.com/vmunier</url>
    </developer>
  </developers>
)
publishMavenStyle := true
repository in bintray := "scalajs"
bintrayPublishSettings
