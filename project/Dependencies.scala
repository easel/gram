import sbt._

object Dependencies {
  object Versions {
    val AWSSDK = "1.11.257"
  }
  val ScalaTest = "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  val Scopt = "com.github.scopt" %% "scopt" % "3.7.0"
  val AWSSDK = Seq(
    "com.amazonaws" % "aws-java-sdk-ecs" % Versions.AWSSDK
  )
}