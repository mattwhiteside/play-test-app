package controllers

import play.api._
import play.api.mvc._
//import play.api.db.slick._
import scala.slick.driver.PostgresDriver.simple._
import models._


object Application extends Controller {
  
  def index = DBAction { implicit rs =>
  	val users = TableQuery[Users]
	
  	val index = users.length + 1
	val insert = users.map(u => (u.email, u.screenname)) returning users.map(_.id)
	val email: String = s"homer+$index@springfieldnuclear.org"
	//DB.withSession{
		insert += (email, "homerjay")
	//}

    Ok(views.html.index("Your new application is ready."))
  }
  
}