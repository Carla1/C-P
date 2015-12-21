// @SOURCE:/home/paulo/Documentos/SI1/play-bd-e-testes/conf/routes
// @HASH:996bb9b96c818226571f617666c3cf5b0c2e89d0
// @DATE:Wed Jun 03 00:12:13 BRT 2015


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
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:10
private[this] lazy val controllers_Application_anuncios2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncios"))))
        

// @LINE:11
private[this] lazy val controllers_Application_criar3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criar"))))
        

// @LINE:12
private[this] lazy val controllers_Application_pesquisa4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pesquisa"))))
        

// @LINE:13
private[this] lazy val controllers_Application_pesquisarAnuncio5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pesquisarAnuncio"))))
        

// @LINE:14
private[this] lazy val controllers_Application_pesquisarAnuncio6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pesquisarAnuncio"))))
        

// @LINE:15
private[this] lazy val controllers_Application_pesquisa7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pesquisa"))))
        

// @LINE:16
private[this] lazy val controllers_Application_criar8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("criar"))))
        

// @LINE:17
private[this] lazy val controllers_Application_newAnuncio9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncios"))))
        

// @LINE:18
private[this] lazy val controllers_Application_deleteAnuncio10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncios/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncios""","""controllers.Application.anuncios()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criar""","""controllers.Application.criar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pesquisa""","""controllers.Application.pesquisa()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pesquisarAnuncio""","""controllers.Application.pesquisarAnuncio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pesquisarAnuncio""","""controllers.Application.pesquisarAnuncio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pesquisa""","""controllers.Application.pesquisa()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """criar""","""controllers.Application.criar()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncios""","""controllers.Application.newAnuncio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncios/$id<[^/]+>/delete""","""controllers.Application.deleteAnuncio(id:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:10
case controllers_Application_anuncios2(params) => {
   call { 
        invokeHandler(controllers.Application.anuncios(), HandlerDef(this, "controllers.Application", "anuncios", Nil,"GET", """""", Routes.prefix + """anuncios"""))
   }
}
        

// @LINE:11
case controllers_Application_criar3(params) => {
   call { 
        invokeHandler(controllers.Application.criar(), HandlerDef(this, "controllers.Application", "criar", Nil,"GET", """""", Routes.prefix + """criar"""))
   }
}
        

// @LINE:12
case controllers_Application_pesquisa4(params) => {
   call { 
        invokeHandler(controllers.Application.pesquisa(), HandlerDef(this, "controllers.Application", "pesquisa", Nil,"GET", """""", Routes.prefix + """pesquisa"""))
   }
}
        

// @LINE:13
case controllers_Application_pesquisarAnuncio5(params) => {
   call { 
        invokeHandler(controllers.Application.pesquisarAnuncio(), HandlerDef(this, "controllers.Application", "pesquisarAnuncio", Nil,"GET", """""", Routes.prefix + """pesquisarAnuncio"""))
   }
}
        

// @LINE:14
case controllers_Application_pesquisarAnuncio6(params) => {
   call { 
        invokeHandler(controllers.Application.pesquisarAnuncio(), HandlerDef(this, "controllers.Application", "pesquisarAnuncio", Nil,"POST", """""", Routes.prefix + """pesquisarAnuncio"""))
   }
}
        

// @LINE:15
case controllers_Application_pesquisa7(params) => {
   call { 
        invokeHandler(controllers.Application.pesquisa(), HandlerDef(this, "controllers.Application", "pesquisa", Nil,"POST", """""", Routes.prefix + """pesquisa"""))
   }
}
        

// @LINE:16
case controllers_Application_criar8(params) => {
   call { 
        invokeHandler(controllers.Application.criar(), HandlerDef(this, "controllers.Application", "criar", Nil,"POST", """""", Routes.prefix + """criar"""))
   }
}
        

// @LINE:17
case controllers_Application_newAnuncio9(params) => {
   call { 
        invokeHandler(controllers.Application.newAnuncio(), HandlerDef(this, "controllers.Application", "newAnuncio", Nil,"POST", """""", Routes.prefix + """anuncios"""))
   }
}
        

// @LINE:18
case controllers_Application_deleteAnuncio10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteAnuncio(id), HandlerDef(this, "controllers.Application", "deleteAnuncio", Seq(classOf[Long]),"POST", """""", Routes.prefix + """anuncios/$id<[^/]+>/delete"""))
   }
}
        
}

}
     