inThisBuild(List(
  organization := "com.vmunier",
  homepage := Some(url("https://github.com/vmunier/scalajs-scripts")),
  licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  developers := List(
    Developer(
      "vmunier",
      "Vincent Munier",
      "",
      url("https://github.com/vmunier")
    )
  ),
  dynverSeparator := "-"
))

name := "scalajs-scripts"
scalaVersion := "2.13.6"
crossScalaVersions := Seq("2.12.15", scalaVersion.value)

enablePlugins(SbtTwirl)

scalacOptions ++= Seq(
  "-encoding", "utf8",
  "-deprecation", "-feature", "-unchecked", "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)
