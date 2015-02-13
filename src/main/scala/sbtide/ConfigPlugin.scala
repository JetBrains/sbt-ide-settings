package sbtide

import sbt._

object ConfigPlugin extends AutoPlugin {
  override def trigger = noTrigger
  val autoImport = Keys
}
