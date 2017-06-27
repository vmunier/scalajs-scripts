name := "scalajs-scripts"

version := "1.1.1-SNAPSHOT"

organization := "com.vmunier"

homepage := Some(url("https://github.com/vmunier/scalajs-scripts"))

scalaVersion := "2.12.2"

crossScalaVersions := Seq("2.10.6", "2.11.8", scalaVersion.value)

enablePlugins(SbtTwirl)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalacOptions ++= Seq(
  "-encoding", "utf8",
  "-deprecation", "-feature", "-unchecked", "-Xlint",
  "-Xfuture",
  "-Yno-adapted-args",
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
