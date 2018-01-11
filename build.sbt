
scalaVersion in ThisBuild := "2.12.4"

lazy val gram = project.in(file("."))
  .settings(
    publish := {},
    libraryDependencies ++= Seq(
    )
  )
  .aggregate(api, lib, cli)

lazy val api = project.in(file("./api"))
  .settings(libraryDependencies += Dependencies.ScalaTest)

lazy val lib = project.in(file("./lib"))
  .dependsOn(api)
  .settings(libraryDependencies += Dependencies.ScalaTest)
  .settings(libraryDependencies ++= Dependencies.AWSSDK)

lazy val cli = project.in(file("./cli"))
  .dependsOn(lib)
  .settings(libraryDependencies += Dependencies.ScalaTest)
  .settings(libraryDependencies += Dependencies.Scopt)
