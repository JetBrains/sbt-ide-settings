package sbtide

import sbt._
import sbt.Keys._

object Keys {

  lazy val ideExportRunConfiguration  = SettingKey[Boolean]("ide-export-run-configuration",
    "Defines whether run configuration of a project should be exported by IDE")
  lazy val ideExportTestConfiguration = SettingKey[Boolean]("ide-export-test-configuration",
    "Defines whether test configuration of a project should be exported by IDE")
  lazy val ideExcludedDirectories = SettingKey[Seq[File]]("ide-excluded-directories",
    "Defines a list of paths to exclude when indexing project by IDE")
  lazy val ideBasePackages = SettingKey[Seq[String]]("ide-base-packages",
    "Defines a list of base packages for IDE")
}
