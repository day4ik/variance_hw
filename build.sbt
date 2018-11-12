name := "variance-hw"

version := "0.0.1"

scalaVersion := "2.12.6"

// tests
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5",
  "org.scalacheck" %% "scalacheck" % "1.14.0"
).map(_ % "test")