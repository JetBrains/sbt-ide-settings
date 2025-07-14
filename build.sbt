import sbt.Keys.name
import sbt.url

lazy val PublishingSettings: Seq[Def.Setting[?]] = Seq(
  organization := "org.jetbrains.scala",

  // Optional but nice-to-have
  organizationName := "JetBrains",
  organizationHomepage := Some(url("https://www.jetbrains.com/")),

  licenses ++= Seq(
    ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
  ),

  homepage := Some(url("https://github.com/JetBrains/sbt-ide-settings")),

  // Source-control coordinates
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/JetBrains/sbt-ide-settings"),
      "git@github.com:JetBrains/sbt-ide-settings.git"
    )
  ),

  // Required by Sonatype for publishing
  developers := List(
    Developer(
      id = "JetBrains",
      name = "JetBrains",
      email = "scala-developers@jetbrains.com",
      url = url("https://github.com/JetBrains")
    )
  ),
)

val root = project.in(file("."))
  .settings(PublishingSettings)
  .settings(
    sbtPlugin := true,
    name := "sbt-ide-settings",

    // cross-build boilerplate,
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
