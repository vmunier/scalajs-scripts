# Scala.js Scripts

[![Latest Version](https://maven-badges.herokuapp.com/maven-central/com.vmunier/scalajs-scripts_2.11/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.vmunier/scalajs-scripts_2.11)
[![License](http://img.shields.io/:license-Apache%202-red.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

Small library which provides a few Twirl templates to link Scala.js output scripts into a HTML page.

## Setup

Add the library to `build.sbt`:
```
libraryDependencies += "com.vmunier" %% "scalajs-scripts" % "1.1.0"
```

## Available Twirl Templates

There are four Twirl templates: `scripts.scala.html`, `selectScript.scala.html`, `jsdeps.scala.html`, `launcher.scala.html`.

- `scripts.scala.html` is the main template, it includes the three other templates.
- `selectScript.scala.html` selects the full-optimized javascript file (`-opt.js`) if it exists, selects the fast-optimized javascript file (`-fastopt.js`) otherwise.
- `jsdeps.scala.html` includes the javascript dependencies if they exist.
- `launcher.scala.html` includes the Scala.js launcher if it exists.

## Usage

The templates have the same parameters, and can be called similarly. The parameters are described below:
```
@(projectName:    String,
  assets:         String => String,
  resourceExists: String => Boolean
)
```

1. `projectName`, name of the Scala.js project, which is used to compute the Scala.js file names, *projectName*-fastopt.js, *projectName*-launcher.js, etc.
2. `assets`, function, which given a Scala.js file name, returns the HTTP route from which the file can be fetched.
3. `resourceExists`, function, which given a Scala.js file name, returns true when the resource exists, false otherwise.

Generic usage for any HTTP-based application (e.g. Akka HTTP, Spray):
```
@scalajs.html.scripts(
  projectName = "client",
  name => s"/assets/$name",
  name => getClass.getResource(s"/public/$name") != null)
```

Usage for the Play Framework specifically:
```
@scalajs.html.scripts(
  "client",
  name => routes.Assets.at(name).toString,
  name => getClass.getResource(s"/public/$name") != null)
```

Usage for the Play Framework with [fingerprinting for public assets](https://www.playframework.com/documentation/2.5.x/AssetsOverview#Reverse-routing-and-fingerprinting-for-public-assets):
```
@scalajs.html.scripts(
  "client",
  name => routes.Assets.versioned(name).toString,
  name => getClass.getResource(s"/public/$name") != null)
```

Additional HTML attributes can be added to the generated `<script>` tags:
```
@scalajs.html.scripts(
  projectName = "client",
  name => s"/assets/$name",
  name => getClass.getResource(s"/public/$name") != null,
  Html("""charset="UTF-8" defer""")
)
```

Note:
The Twirl templates require a `resourceExists` function because the application classpath may not be accessible from the library.
Play for instance, puts libraries in a parent classpath of the application, meaning they can't see the classes provided by the application.
Since the classloaders are split, libraries can never make any assumptions about their classloader with regards to the applications classloader.
More info about Play classloader can be found in [this issue](https://github.com/playframework/playframework/issues/2847).
