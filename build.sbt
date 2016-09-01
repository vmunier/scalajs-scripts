name := "scalajs-scripts"

version := "0.5.1-SNAPSHOT"

organization := "com.vmunier"

homepage := Some(url("https://github.com/vmunier/scalajs-scripts"))

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", scalaVersion.value)

enablePlugins(SbtTwirl)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

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
