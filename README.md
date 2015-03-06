# SBT plugin for tweaking various IDE settings

This plugin provides several keys to be read by IDE while importing project.
Currently SBT 0.13 only.

## Usage

1. Add the following lines to `project/plugins.sbt`:

 ```Scala
 resolvers += Resolver.url("jetbrains-bintray",
   url("http://dl.bintray.com/jetbrains/sbt-plugins/"))(Resolver.ivyStylePatterns)

 addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "0.0-<sha-of-the-latest-commit>")
 ```

2. Tweak any settings you want

## Available settings

- `ideExportRunConfiguration` 

  Indicates whether run configuration of selected project should or should not be exported

- `ideExportTestConfiguration` 

  Indicates whether test configuration of selected project should or should not be exported

- `ideExcludedDirectories`

  Defines list of directories to be marked as excluded in IDE
  
- `ideBasePackages`

  Defines list of packages to be used as base prefixes for chaining. Packages starting with one of these prefixes will be chained automatically in IDE.
