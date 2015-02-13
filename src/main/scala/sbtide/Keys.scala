package sbtide

import sbt._

object Keys {

  lazy val ideExportRunConfiguration  = SettingKey[Boolean]("ide-export-run-configuration",
    "Defines whether run configuration of a project should be exported by IDE")
  lazy val ideExportTestConfiguration = SettingKey[Boolean]("ide-export-test-configuration",
    "Defines whether test configuration of a project should be exported by IDE")

  lazy val ideDefaultSettings = Seq(
    ideExportRunConfiguration  := false,
    ideExportTestConfiguration := false
  )
}
