
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Glen/Desktop/New folder/webca2part2/conf/routes
// @DATE:Fri Dec 16 18:15:44 GMT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:10
  LoginController_4: controllers.LoginController,
  // @LINE:28
  CountController_0: controllers.CountController,
  // @LINE:30
  AsyncController_2: controllers.AsyncController,
  // @LINE:33
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:10
    LoginController_4: controllers.LoginController,
    // @LINE:28
    CountController_0: controllers.CountController,
    // @LINE:30
    AsyncController_2: controllers.AsyncController,
    // @LINE:33
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.HomeController.search"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.HomeController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """otherprofile""", """controllers.HomeController.otherprofile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserProfile""", """controllers.HomeController.updateUserProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delUser/""" + "$" + """email<[^/]+>""", """controllers.HomeController.deleteAccount(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUser/""" + "$" + """email<[^/]+>""", """controllers.HomeController.updateUser(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProfile/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProfile(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """otherProfileGenerate/""" + "$" + """email<[^/]+>""", """controllers.HomeController.otherProfileGenerate(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserSubmit""", """controllers.HomeController.updateUserSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserProfileSubmit""", """controllers.HomeController.updateUserProfileSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_1.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login2_invoker = createInvoker(
    LoginController_4.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LoginController_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout3_invoker = createInvoker(
    LoginController_4.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_profile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile4_invoker = createInvoker(
    HomeController_1.profile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_signup5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup5_invoker = createInvoker(
    HomeController_1.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_search6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_HomeController_search6_invoker = createInvoker(
    HomeController_1.search,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_update7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_HomeController_update7_invoker = createInvoker(
    HomeController_1.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "update",
      Nil,
      "GET",
      """""",
      this.prefix + """update"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_otherprofile8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("otherprofile")))
  )
  private[this] lazy val controllers_HomeController_otherprofile8_invoker = createInvoker(
    HomeController_1.otherprofile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "otherprofile",
      Nil,
      "GET",
      """""",
      this.prefix + """otherprofile"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_updateUserProfile9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserProfile")))
  )
  private[this] lazy val controllers_HomeController_updateUserProfile9_invoker = createInvoker(
    HomeController_1.updateUserProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUserProfile",
      Nil,
      "GET",
      """""",
      this.prefix + """updateUserProfile"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_deleteAccount10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delUser/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteAccount10_invoker = createInvoker(
    HomeController_1.deleteAccount(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteAccount",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """delUser/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_updateUser11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUser/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateUser11_invoker = createInvoker(
    HomeController_1.updateUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """updateUser/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_updateProfile12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProfile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProfile12_invoker = createInvoker(
    HomeController_1.updateProfile(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProfile",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """updateProfile/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_otherProfileGenerate13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("otherProfileGenerate/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_otherProfileGenerate13_invoker = createInvoker(
    HomeController_1.otherProfileGenerate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "otherProfileGenerate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """otherProfileGenerate/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_LoginController_loginSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit14_invoker = createInvoker(
    LoginController_4.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_addUserSubmit15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit15_invoker = createInvoker(
    HomeController_1.addUserSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addUserSubmit"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_updateUserSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_updateUserSubmit16_invoker = createInvoker(
    HomeController_1.updateUserSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUserSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """updateUserSubmit"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_updateUserProfileSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserProfileSubmit")))
  )
  private[this] lazy val controllers_HomeController_updateUserProfileSubmit17_invoker = createInvoker(
    HomeController_1.updateUserProfileSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUserProfileSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """updateUserProfileSubmit"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CountController_count18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count18_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AsyncController_message19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message19_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Assets_versioned20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned20_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:9
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_1.about)
      }
  
    // @LINE:10
    case controllers_LoginController_login2_route(params) =>
      call { 
        controllers_LoginController_login2_invoker.call(LoginController_4.login)
      }
  
    // @LINE:11
    case controllers_LoginController_logout3_route(params) =>
      call { 
        controllers_LoginController_logout3_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:12
    case controllers_HomeController_profile4_route(params) =>
      call { 
        controllers_HomeController_profile4_invoker.call(HomeController_1.profile)
      }
  
    // @LINE:13
    case controllers_HomeController_signup5_route(params) =>
      call { 
        controllers_HomeController_signup5_invoker.call(HomeController_1.signup)
      }
  
    // @LINE:14
    case controllers_HomeController_search6_route(params) =>
      call { 
        controllers_HomeController_search6_invoker.call(HomeController_1.search)
      }
  
    // @LINE:15
    case controllers_HomeController_update7_route(params) =>
      call { 
        controllers_HomeController_update7_invoker.call(HomeController_1.update)
      }
  
    // @LINE:16
    case controllers_HomeController_otherprofile8_route(params) =>
      call { 
        controllers_HomeController_otherprofile8_invoker.call(HomeController_1.otherprofile)
      }
  
    // @LINE:17
    case controllers_HomeController_updateUserProfile9_route(params) =>
      call { 
        controllers_HomeController_updateUserProfile9_invoker.call(HomeController_1.updateUserProfile)
      }
  
    // @LINE:18
    case controllers_HomeController_deleteAccount10_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_deleteAccount10_invoker.call(HomeController_1.deleteAccount(email))
      }
  
    // @LINE:19
    case controllers_HomeController_updateUser11_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_updateUser11_invoker.call(HomeController_1.updateUser(email))
      }
  
    // @LINE:20
    case controllers_HomeController_updateProfile12_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_updateProfile12_invoker.call(HomeController_1.updateProfile(id))
      }
  
    // @LINE:21
    case controllers_HomeController_otherProfileGenerate13_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_otherProfileGenerate13_invoker.call(HomeController_1.otherProfileGenerate(email))
      }
  
    // @LINE:22
    case controllers_LoginController_loginSubmit14_route(params) =>
      call { 
        controllers_LoginController_loginSubmit14_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:23
    case controllers_HomeController_addUserSubmit15_route(params) =>
      call { 
        controllers_HomeController_addUserSubmit15_invoker.call(HomeController_1.addUserSubmit)
      }
  
    // @LINE:24
    case controllers_HomeController_updateUserSubmit16_route(params) =>
      call { 
        controllers_HomeController_updateUserSubmit16_invoker.call(HomeController_1.updateUserSubmit)
      }
  
    // @LINE:25
    case controllers_HomeController_updateUserProfileSubmit17_route(params) =>
      call { 
        controllers_HomeController_updateUserProfileSubmit17_invoker.call(HomeController_1.updateUserProfileSubmit)
      }
  
    // @LINE:28
    case controllers_CountController_count18_route(params) =>
      call { 
        controllers_CountController_count18_invoker.call(CountController_0.count)
      }
  
    // @LINE:30
    case controllers_AsyncController_message19_route(params) =>
      call { 
        controllers_AsyncController_message19_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:33
    case controllers_Assets_versioned20_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned20_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
