import sbt.Keys.name
import xerial.sbt.Sonatype.GitHubHosting

val sonatypeSettings: Seq[Def.Setting[?]] = Seq(
  sonatypeProfileName := "org.jetbrains",
  homepage := Some(url("https://github.com/JetBrains/sbt-ide-settings")),
  sonatypeProjectHosting := Some(GitHubHosting("JetBrains", "sbt-ide-settings", "scala-developers@jetbrains.com")),
  licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
)

val root = project.in(file("."))
  .settings(
    sbtPlugin := true,
    name := "sbt-ide-settings",
    organization := "org.jetbrains.scala",
    sonatypeSettings,

    // publishing boilerplate,
    crossSbtVersions := Nil, // handled by explicitly setting sbtVersion via scalaVersion
    crossScalaVersions := Seq("2.12.18", "2.10.7"),
    pluginCrossBuild / sbtVersion := {
      // keep this as low as possible to avoid running into binary incompatibility such as https://github.com/sbt/sbt/issues/5049,
      scalaBinaryVersion.value match {
        case "2.10" => "0.13.17"
        case "2.12" => "1.2.1"
      }
    },
  )
