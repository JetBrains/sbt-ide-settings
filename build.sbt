import bintray.Keys._

sbtPlugin := true

name := "sbt-idea-config"

organization := "org.jetbrains"

version := "0.0.1"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

scalaVersion := "2.10.4"

publishMavenStyle := false

bintrayPublishSettings

repository in bintray := "sbt-idea-config"

bintrayOrganization in bintray := None