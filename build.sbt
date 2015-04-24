import bintray.Keys._

name := "play-scalajs-scripts"

version := "0.2.2-SNAPSHOT"

organization := "com.vmunier"

homepage := Some(url("https://github.com/vmunier/play-scalajs-scripts"))

crossScalaVersions := Seq("2.10.4", "2.11.2")

// PlayScala needs to be enabled, SbtTwirl can't be used alone because play.api.Play is needed
enablePlugins(PlayScala)

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
