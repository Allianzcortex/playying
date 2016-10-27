package controllers

import play.api.mvc._
/**
  * Created by hzcortex on 16-10-27.
  */

case class Post(title:String,abstrac:String,content:String){

}

class Post extends Controller {
  var Posts=Set(
    Post("title1","abstract1","content1"),
    Post("title2","abstract2","content2")
  )

  def getDetail=Action{implicit request =>


  }
}
