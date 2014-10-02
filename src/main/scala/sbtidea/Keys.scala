package sbtidea

import sbt._

object Keys {

  lazy val exportRunConfiguration  = SettingKey[Boolean]("defines whether run configuration of a project should be exported to idea")
  lazy val artifactRunDependencies = SettingKey[Seq[String]]("which artifacts should be built before running an idea configuration")
  lazy val testInPackage = SettingKey[String]("which package to run tests in in exported configuration")

  exportRunConfiguration  := false
  artifactRunDependencies := Seq()
  testInPackage := ""

  val SbtIdea = config("sbtidea")
}
