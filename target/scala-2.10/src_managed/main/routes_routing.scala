// @SOURCE:/Users/hatsune.kitajima/Documents/play/dbtest/conf/routes
// @HASH:fbb9aee9a3c2398c373fa9c9c621666fb2d48ea3
// @DATE:Tue May 10 18:35:51 JST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_add1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
        

// @LINE:8
private[this] lazy val controllers_Application_create2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("create"))))
        

// @LINE:9
private[this] lazy val controllers_Application_setItem3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("item"))))
        

// @LINE:10
private[this] lazy val controllers_Application_edit4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit"))))
        

// @LINE:11
private[this] lazy val controllers_Application_update5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update"))))
        

// @LINE:12
private[this] lazy val controllers_Application_delete6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete"))))
        

// @LINE:13
private[this] lazy val controllers_Application_remove7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove"))))
        

// @LINE:14
private[this] lazy val controllers_Application_find8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("find"))))
        

// @LINE:17
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Application.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """create""","""controllers.Application.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """item""","""controllers.Application.setItem()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit""","""controllers.Application.edit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update""","""controllers.Application.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete""","""controllers.Application.delete()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove""","""controllers.Application.remove()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """find""","""controllers.Application.find()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_add1(params) => {
   call { 
        invokeHandler(controllers.Application.add(), HandlerDef(this, "controllers.Application", "add", Nil,"GET", """""", Routes.prefix + """add"""))
   }
}
        

// @LINE:8
case controllers_Application_create2(params) => {
   call { 
        invokeHandler(controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil,"POST", """""", Routes.prefix + """create"""))
   }
}
        

// @LINE:9
case controllers_Application_setItem3(params) => {
   call { 
        invokeHandler(controllers.Application.setItem(), HandlerDef(this, "controllers.Application", "setItem", Nil,"GET", """""", Routes.prefix + """item"""))
   }
}
        

// @LINE:10
case controllers_Application_edit4(params) => {
   call { 
        invokeHandler(controllers.Application.edit(), HandlerDef(this, "controllers.Application", "edit", Nil,"POST", """""", Routes.prefix + """edit"""))
   }
}
        

// @LINE:11
case controllers_Application_update5(params) => {
   call { 
        invokeHandler(controllers.Application.update(), HandlerDef(this, "controllers.Application", "update", Nil,"POST", """""", Routes.prefix + """update"""))
   }
}
        

// @LINE:12
case controllers_Application_delete6(params) => {
   call { 
        invokeHandler(controllers.Application.delete(), HandlerDef(this, "controllers.Application", "delete", Nil,"GET", """""", Routes.prefix + """delete"""))
   }
}
        

// @LINE:13
case controllers_Application_remove7(params) => {
   call { 
        invokeHandler(controllers.Application.remove(), HandlerDef(this, "controllers.Application", "remove", Nil,"POST", """""", Routes.prefix + """remove"""))
   }
}
        

// @LINE:14
case controllers_Application_find8(params) => {
   call { 
        invokeHandler(controllers.Application.find(), HandlerDef(this, "controllers.Application", "find", Nil,"GET", """""", Routes.prefix + """find"""))
   }
}
        

// @LINE:17
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     