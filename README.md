# SBT plugin for tweaking various IDE settings

This plugin provides several keys to be read by IDE while importing project. Currently SBT 0.13 only.

## Usage

1. Add the following lines to `project/plugins.sbt`:

```Scala
resolvers += Resolver.url("jetbrains-bintray",
  url("http://dl.bintray.com/jetrains/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "0.0.<sha-of-the-latest-commit>")
```

2. Put `ideDefaultSettings` in your build.sbt and then tweak any settings you want
