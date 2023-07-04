package sbtide

object ConfigPlugin extends sbt.AutoPlugin {
  override def trigger = noTrigger
  val autoImport = Keys
}
