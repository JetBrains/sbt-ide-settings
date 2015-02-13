import bintray.Keys._

val commonSettings = Seq(
  sbtPlugin := true,
  name := "sbt-ide-settings",
  organization := "org.jetbrains",
  licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")),
  scalaVersion := "2.10.4"
)

val publishSettings = bintrayPublishSettings ++ Seq(
  publishMavenStyle := false,
  repository in bintray := "sbt-plugins",
  bintrayOrganization in bintray := Some("jetbrains")
)

commonSettings ++ publishSettings
