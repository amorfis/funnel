
import oncue.build._

OnCue.baseSettings

ScalaCheck.settings

ScalaTest.settings

fork in (run in Test) := true

libraryDependencies += "io.argonaut" %% "argonaut" % "6.0.1"