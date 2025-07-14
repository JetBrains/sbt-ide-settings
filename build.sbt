import sbt.Keys.name
import sbt.internal.sona
import sbt.librarymanagement.ivy.Credentials

ThisBuild / organization := "org.jetbrains"

// Optional but nice-to-have
ThisBuild / organizationName     := "JetBrains"
ThisBuild / organizationHomepage := Some(url("https://www.jetbrains.com/"))


ThisBuild / licenses ++= Seq(
  ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
)

ThisBuild / homepage := Some(url("https://github.com/JetBrains/sbt-ide-settings"))

// Source-control coordinates
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/JetBrains/sbt-ide-settings"),
    "git@github.com:JetBrains/sbt-ide-settings.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id    = "JetBrains",
    name  = "JetBrains",
    email = "scala-developers@jetbrains.com",
    url   = url("https://github.com/JetBrains")
  )
)

val root = project.in(file("."))
  .settings(
    sbtPlugin := true,
    name := "sbt-ide-settings",
    organization := "org.jetbrains.scala",

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
