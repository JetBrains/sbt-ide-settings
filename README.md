# SBT plugin for tweaking various IDE settings

[ ![Download](https://api.bintray.com/packages/jetbrains/sbt-plugins/sbt-ide-settings/images/download.svg) ](https://bintray.com/jetbrains/sbt-plugins/sbt-ide-settings/_latestVersion)
[![Build Status](https://travis-ci.org/JetBrains/sbt-ide-settings.svg?branch=master)](https://travis-ci.org/JetBrains/sbt-ide-settings)

This plugin provides several keys to be read by IDE while importing project.
Available for sbt 0.13.5+ and 1.0

## Usage

1. Add the following lines to `project/plugins.sbt`:

 ```Scala
 addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "1.0.0")
 ```

2. Tweak any settings you want

## Available settings

- `ideExcludedDirectories : Seq[File]`

  List of directories to be marked as excluded in IDE.

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
SettingKey[Seq[String]]("ide-base-packages") := Seq("package1", "package2")
SettingKey[Boolean]("ide-skip-project") := true
SettingKey[Option[File]]("ide-output-directory") := Option(file("some/file"))
```
