sbtPlugin := true
name := "sbt-ide-settings"
organization := "org.jetbrains"
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

crossSbtVersions := Seq("0.13.16", "1.0.0")

publishMavenStyle := false

bintrayRepository := "sbt-plugins"
bintrayOrganization := Some("jetbrains")
