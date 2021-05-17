name := "scalajs-scripts"

version := "1.1.5-SNAPSHOT"

organization := "com.vmunier"

homepage := Some(url("https://github.com/vmunier/scalajs-scripts"))

scalaVersion := "2.13.6"

crossScalaVersions := Seq("2.12.11", scalaVersion.value)

enablePlugins(SbtTwirl)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalacOptions ++= Seq(
  "-encoding", "utf8",
  "-deprecation", "-feature", "-unchecked", "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)

pomExtra := (
  <scm>
    <url>git@github.com:vmunier/scalajs-scripts.git</url>
    <connection>scm:git:git@github.com:vmunier/scalajs-scripts.git</connection>
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
bintrayRepository := "scalajs"
