# Play Scala.js Scripts

[![Latest Version](https://maven-badges.herokuapp.com/maven-central/com.vmunier/play-scalajs-scripts_2.11/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.vmunier/play-scalajs-scripts_2.11)
[![License](http://img.shields.io/:license-Apache%202-red.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

Small library which provides a few Twirl Play templates to link Scala.js output scripts into a HTML page.

## Available twirl templates

- `scripts.scala.html` includes the three other templates.

Classic usage:
```
@playscalajs.html.scripts(projectName = "client")
```
Usage with [fingerprinting for public assets](https://www.playframework.com/documentation/2.4.x/Assets#Reverse-routing-and-fingerprinting-for-public-assets):
```
@playscalajs.html.scripts(projectName = "client", fileName => routes.Assets.versioned(fileName).toString)
```
- `selectScript.scala.html` selects the optimised javascript file when the application runs in prod mode.
- `jsdeps.scala.html` includes the javascript dependencies if they exist.
- `launcher.scala.html` includes the Scala.js launcher.
