// @SOURCE:/home/paulo/Documentos/SI1/play-bd-e-testes/conf/routes
// @HASH:996bb9b96c818226571f617666c3cf5b0c2e89d0
// @DATE:Wed Jun 03 00:12:13 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def anuncios(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "anuncios")
}
                                                

// @LINE:15
// @LINE:12
def pesquisa(): Call = {
   () match {
// @LINE:12
case () if true => Call("GET", _prefix + { _defaultPrefix } + "pesquisa")
                                                        
// @LINE:15
case () if true => Call("POST", _prefix + { _defaultPrefix } + "pesquisa")
                                                        
   }
}
                                                

// @LINE:14
// @LINE:13
def pesquisarAnuncio(): Call = {
   () match {
// @LINE:13
case () if true => Call("GET", _prefix + { _defaultPrefix } + "pesquisarAnuncio")
                                                        
// @LINE:14
case () if true => Call("POST", _prefix + { _defaultPrefix } + "pesquisarAnuncio")
                                                        
   }
}
                                                

// @LINE:17
def newAnuncio(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "anuncios")
}
                                                

// @LINE:18
def deleteAnuncio(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "anuncios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:16
// @LINE:11
def criar(): Call = {
   () match {
// @LINE:11
case () if true => Call("GET", _prefix + { _defaultPrefix } + "criar")
                                                        
// @LINE:16
case () if true => Call("POST", _prefix + { _defaultPrefix } + "criar")
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def anuncios : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.anuncios",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncios"})
      }
   """
)
                        

// @LINE:15
// @LINE:12
def pesquisa : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.pesquisa",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pesquisa"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pesquisa"})
      }
      }
   """
)
                        

// @LINE:14
// @LINE:13
def pesquisarAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.pesquisarAnuncio",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pesquisarAnuncio"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pesquisarAnuncio"})
      }
      }
   """
)
                        

// @LINE:17
def newAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newAnuncio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncios"})
      }
   """
)
                        

// @LINE:18
def deleteAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteAnuncio",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:16
// @LINE:11
def criar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.criar",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "criar"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "criar"})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def anuncios(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.anuncios(), HandlerDef(this, "controllers.Application", "anuncios", Seq(), "GET", """""", _prefix + """anuncios""")
)
                      

// @LINE:12
def pesquisa(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.pesquisa(), HandlerDef(this, "controllers.Application", "pesquisa", Seq(), "GET", """""", _prefix + """pesquisa""")
)
                      

// @LINE:13
def pesquisarAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.pesquisarAnuncio(), HandlerDef(this, "controllers.Application", "pesquisarAnuncio", Seq(), "GET", """""", _prefix + """pesquisarAnuncio""")
)
                      

// @LINE:17
def newAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newAnuncio(), HandlerDef(this, "controllers.Application", "newAnuncio", Seq(), "POST", """""", _prefix + """anuncios""")
)
                      

// @LINE:18
def deleteAnuncio(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteAnuncio(id), HandlerDef(this, "controllers.Application", "deleteAnuncio", Seq(classOf[Long]), "POST", """""", _prefix + """anuncios/$id<[^/]+>/delete""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def criar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.criar(), HandlerDef(this, "controllers.Application", "criar", Seq(), "GET", """""", _prefix + """criar""")
)
                      
    
}
                          
}
        
    