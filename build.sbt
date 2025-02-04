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
scalaVersion := "3.3.5"
crossScalaVersions := Seq("2.13.12", scalaVersion.value)

enablePlugins(SbtTwirl)

scalacOptions ++= Seq("-encoding", "utf8", "-deprecation", "-feature", "-unchecked")

libraryDependencies ++= (CrossVersion.partialVersion(scalaVersion.value) match {
  case Some((3, _)) => Seq()
  case _            => Seq("org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided")
})
