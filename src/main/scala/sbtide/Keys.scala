package sbtide

import sbt._
import sbt.Keys._

object Keys {
  lazy val ideExcludedDirectories = SettingKey[Seq[File]]("ide-excluded-directories",
    "List of paths to automatically exclude in IDE")
  lazy val ideBasePackages = SettingKey[Seq[String]]("ide-base-packages",
    "List of packages to be used as prefixes in package chaining")
  lazy val ideSkipProject = SettingKey[Boolean]("ide-skip-project",
    "Flag indicating that current subproject should be skipped from importing")
}
