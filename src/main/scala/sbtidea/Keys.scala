package sbtidea

import sbt._

object Keys {

  lazy val exportRunConfiguration = SettingKey[Boolean]("defines whether run configuration of a project should be exported to idea")
  lazy val artifactRunDependencies   = SettingKey[Seq[String]]("which artifacts should be built before running an idea configuration")

  exportRunConfiguration  := false
  artifactRunDependencies := Seq()

  val SbtIdea = config("sbtidea")
}
