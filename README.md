SBT plugin to export Intellij Idea setings
============================================

Plugin provides several keys to be read by [sbt-structure](https://github.com/JetBrains/sbt-structure) plugin and imported 
as respective settings into generated Idea project.

Plugin usage
-----

`exportRunConfiguration`
- Set to `true` in project which you want to export run configuration from


`artifactRunDependencies`
- List of artifact names which need to be built before running a configuration


`testInPackage`
- Set to export scalatest run configuration as Idea "Run in package" test run configuration
