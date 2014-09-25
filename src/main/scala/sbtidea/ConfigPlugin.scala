package sbtidea

import sbt._

object ConfigPlugin extends AutoPlugin {
//  object autoImport {
//  }
  override def trigger = noTrigger
  val autoImport = Keys
}
