lazy val root = (project in file("."))
.settings(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.4" % Test
  )
)