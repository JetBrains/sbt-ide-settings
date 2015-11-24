# SBT plugin for tweaking various IDE settings

[ ![Download](https://api.bintray.com/packages/jetbrains/sbt-plugins/sbt-ide-settings/images/download.svg) ](https://bintray.com/jetbrains/sbt-plugins/sbt-ide-settings/_latestVersion)

This plugin provides several keys to be read by IDE while importing project.
SBT 0.13.5 and up.

## Usage (per-project configuration)

1. Add the following lines to `project/plugins.sbt`:

 ```Scala
 resolvers += Resolver.url("jetbrains-bintray",
   url("http://dl.bintray.com/jetbrains/sbt-plugins/"))(Resolver.ivyStylePatterns)

 addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "<version>")
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

- `ideExcludedDirectories :: Seq[File]`

  List of directories to be marked as excluded in IDE.

- `ideBasePackages :: Seq[String]`

  List of packages to be used as base prefixes for chaining. Packages starting
  with one of these prefixes will be chained automatically in IDE.

- `ideSkipProject :: Boolean`

  Flag indicating that current subproject should be skipped from importing.

- `ideOutputDirectory :: Option[File]`

  Directory to use for production and test output instead of SBT's `target`
  directory.
