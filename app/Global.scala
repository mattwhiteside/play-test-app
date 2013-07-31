import play.api.GlobalSettings

import models._
import play.api.db.DB
import play.api.Application
import play.api.Play.current

import scala.slick.driver.PostgresDriver.simple._


object Global extends GlobalSettings {

  override def onStart(app: Application) {

    lazy val database = Database.forDataSource(DB.getDataSource())

    database withSession { implicit session =>       
      // Create the tables, including primary and foreign keys
      val users = TableQuery[Users]
      System.out.println("starting up...")
      

      //users.ddl.drop
      //users.ddl.create
      
      val insert = users.map(u => (u.email, u.screenname)) returning users.map(_.id)
      insert += ("homer@springfieldnuclear.org", "homerjay")
    }
  }
}