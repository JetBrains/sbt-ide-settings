package sbtide

import sbt._
import sbt.Keys._

object Keys {
  lazy val ideExcludedDirectories = SettingKey[Seq[File]]("ide-excluded-directories",
    "List of paths to automatically exclude in IDE")
  lazy val idePackagePrefix = SettingKey[Option[String]]("ide-package-prefix",
    "If package prefix is org.example.application, a PATH is a source directory implies org/example/application/PATH, so you don't have to create explicit org, example, and application subdirectories.")
  lazy val ideBasePackages = SettingKey[Seq[String]]("ide-base-packages",
    "List of packages to be used as prefixes in package chaining")
  lazy val ideSkipProject = SettingKey[Boolean]("ide-skip-project",
    "Flag indicating that current subproject should be skipped from importing")
  lazy val ideOutputDirectory = SettingKey[Option[File]]("ide-output-directory",
    "Directory to use for production and test output instead of SBT's `target` directory")
}
