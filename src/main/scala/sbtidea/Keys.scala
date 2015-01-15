package sbtidea

import sbt._

object Keys {

  lazy val exportRunConfiguration  = settingKey[Boolean]("defines whether run configuration of a project should be exported to Idea")
  lazy val exportTestConfiguration = settingKey[Boolean]("defines whether test configuration of a project should be exported to Idea")
  lazy val unmanagedLibrarySources = settingKey[Option[Seq[String]]]("set of sources for unmanaged libraries in Idea VirtualFile format")

  exportRunConfiguration  := false
  exportTestConfiguration := false
  unmanagedLibrarySources := None

  val SbtIdea = config("sbtidea")
}
