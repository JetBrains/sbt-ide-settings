lazy val root = project.in(file("."))
  .settings(
    scalaVersion := "2.12.21",
    ideExcludedDirectories := Seq(baseDirectory.value / "excluded"),
    idePackagePrefix := Some("org.example"),
    ideBasePackages := Seq("org.example"),
    ideSkipProject := false,
    ideOutputDirectory := Some(baseDirectory.value / "out"),

    TaskKey[Unit]("printKeys") := {
      println(s"ideExcludedDirectories: ${ideExcludedDirectories.value}")
      println(s"idePackagePrefix: ${idePackagePrefix.value}")
      println(s"ideBasePackages: ${ideBasePackages.value}")
      println(s"ideSkipProject: ${ideSkipProject.value}")
      println(s"ideOutputDirectory: ${ideOutputDirectory.value}")
    }
  )
