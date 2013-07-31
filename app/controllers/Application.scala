package controllers

import play.api._
import play.api.mvc._
import scala.slick.driver.PostgresDriver.simple._


//import scala.slick.driver.H2Driver.simple._
// import scala.slick.direct._
// import scala.slick.direct.AnnotationMapper._
// import scala.reflect.runtime.universe
// import scala.slick.jdbc.StaticQuery.interpolation

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
}