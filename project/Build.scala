import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "playapp"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    jdbc,
    anorm,
    "com.typesafe.slick" % "slick_2.10" % "2.0.0-M2",
    // "org.slf4j" % "slf4j-api" % "1.7.3",
    "org.postgresql" % "postgresql" % "9.2-1003-jdbc4"    
  )
  


  val main = play.Project(appName, appVersion, appDependencies).settings(
    scalaVersion := "2.10.2"
  )

}