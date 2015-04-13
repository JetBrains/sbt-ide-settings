# SBT plugin for tweaking various IDE settings

[ ![Download](https://api.bintray.com/packages/jetbrains/sbt-plugins/sbt-ide-settings/images/download.svg) ](https://bintray.com/jetbrains/sbt-plugins/sbt-ide-settings/_latestVersion)

This plugin provides several keys to be read by IDE while importing project.
SBT 0.13.5 and up.

## Usage

1. Add the following lines to `project/plugins.sbt`:

 ```Scala
 resolvers += Resolver.url("jetbrains-bintray",
   url("http://dl.bintray.com/jetbrains/sbt-plugins/"))(Resolver.ivyStylePatterns)

 addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "<version>")
 ```

2. Tweak any settings you want

## Available settings

- `ideExcludedDirectories`

  List of directories to be marked as excluded in IDE.

- `ideBasePackages`

  List of packages to be used as base prefixes for chaining. Packages starting
  with one of these prefixes will be chained automatically in IDE.

## Upcoming settings

- `ideExportRunConfiguration`

  Indicates whether run configuration of selected project should or should not
  be exported

- `ideExportTestConfiguration`

  Indicates whether test configuration of selected project should or should not
  be exported
