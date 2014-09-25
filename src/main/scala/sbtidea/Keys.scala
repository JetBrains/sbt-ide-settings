package sbtidea

import sbt._

object Keys {

  lazy val exportedRunConfigurations = SettingKey[Seq[Project]]("run configurations of which projects should be exported to idea")
  lazy val artifactRunDependencies   = SettingKey[Seq[String]]("which artifacts should be built before running an idea configuration")

  exportedRunConfigurations := Seq()
  artifactRunDependencies := Seq()

  val SbtIdea = config("sbtidea")
}
