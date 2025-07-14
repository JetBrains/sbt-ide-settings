# SBT plugin for configuring IDE settings

[![Version](https://index.scala-lang.org/jetbrains/sbt-ide-settings/sbt-ide-settings/latest.svg)](https://index.scala-lang.org/jetbrains/sbt-ide-settings/sbt-ide-settings)
[![Build Status](https://travis-ci.org/JetBrains/sbt-ide-settings.svg?branch=master)](https://travis-ci.org/JetBrains/sbt-ide-settings)
[![JetBrains team project](http://jb.gg/badges/team.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)

This plugin provides keys to configure IDE settings.
Available for sbt 0.13.5+ and 1.0+

## Usage (per-project configuration)

1. Add the following lines to `project/plugins.sbt`:

 ```Scala
 addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings" % "1.1.3")
 ```

2. in the project ``*.scala`` or ``*.sbt`` file:

```Scala
     settings(
         ideExcludedDirectories := Seq(
           baseDirectory.value / ".ensime_cache",
           baseDirectory.value / ".idea")
     )
```

3. Tweak any settings you want

## Usage (global configuration for all projects)

1. Add the following lines to `~/.sbt/0.13/plugins/plugins.sbt`:

```Scala
 resolvers += Resolver.url("jetbrains-bintray",
   url("http://dl.bintray.com/jetbrains/sbt-plugins/"))(Resolver.ivyStylePatterns)

 addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "<version>")
```

2. Add the following lines to a new file `~/.sbt/0.13/plugins/sbt-idea-config.scala`:

```Scala
import sbt._
import Keys._

object IDEAConfig extends Plugin {

  override def settings = Seq(
    sbtide.Keys.ideExcludedDirectories := Seq(
      baseDirectory.value / ".ensime_cache",
      baseDirectory.value / ".idea")
  )

}
```

3. Tweak any settings you want

## Available settings

- `ideExcludedDirectories : Seq[File]`

  List of directories to be marked as excluded in IDE.

- `idePackagePrefix : Option[String]`

  If package prefix is `org.example.application`, a `PATH` is a source directory implies `org/example/application/PATH`,
  so you don't have to create `org`, `example`, and `application` subdirectories ([more info](https://www.jetbrains.com/help/idea/content-roots.html#assign_package_prefix)).

- `ideBasePackages : Seq[String]`

  List of packages to be used as base prefixes for chaining. Packages starting
  with one of these prefixes will be chained automatically in IDE.

- `ideSkipProject : Boolean`

  Flag indicating that current subproject should be skipped from importing.

- `ideOutputDirectory : Option[File]`

  Directory to use for production and test output instead of SBT's `target`
  directory.

## Using the settings without plugin

All the settings in this plugin are simply flags that are respected by IntelliJ IDEA on project import.
They can be added to a project as a setting without including this plugin in the following format:

```scala
SettingKey[Seq[File]]("ide-excluded-directories") := Seq(file("some/file"))
SettingKey[Option[String]]("ide-package-prefix") := Option("org.example.application")
SettingKey[Seq[String]]("ide-base-packages") := Seq("package1", "package2")
SettingKey[Boolean]("ide-skip-project") := true
SettingKey[Option[File]]("ide-output-directory") := Option(file("some/file"))
```
