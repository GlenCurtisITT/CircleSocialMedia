
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Circle - Login", null, null)/*5.36*/ {_display_(Seq[Any](format.raw/*5.38*/("""
  """),format.raw/*6.3*/("""<div class="row">
    <div class="col-xs-6">
      <h3>Sign in</h3>
      """),_display_(/*9.8*/if(loginForm.hasGlobalErrors)/*9.37*/{_display_(Seq[Any](format.raw/*9.38*/("""
        """),format.raw/*10.9*/("""<p class="alert alert-warning">
        """),_display_(/*11.10*/loginForm/*11.19*/.globalError.message),format.raw/*11.39*/("""
        """),format.raw/*12.9*/("""</p>
      """)))}),format.raw/*13.8*/("""
      """),_display_(/*14.8*/if(flash.containsKey("error"))/*14.38*/{_display_(Seq[Any](format.raw/*14.39*/("""
        """),format.raw/*15.9*/("""<div class="alert alert-warning">
        """),_display_(/*16.10*/flash/*16.15*/.get("loginRequired")),format.raw/*16.36*/("""
        """),format.raw/*17.9*/("""</div>
      """)))}),format.raw/*18.8*/("""
      """),format.raw/*19.7*/("""<div class="well">
        <h3 class="whiteText">Sign In</h3>
      """),_display_(/*21.8*/helper/*21.14*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.78*/{_display_(Seq[Any](format.raw/*21.79*/("""
        """),format.raw/*22.9*/("""<div class="form-group">
        """),_display_(/*23.10*/inputText(loginForm("email"), '_label -> "",
          'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*24.70*/("""
        """),format.raw/*25.9*/("""</div>
        <div class="form-group">
        """),_display_(/*27.10*/inputPassword(loginForm("password"), '_label -> "",
          'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*28.73*/("""
        """),format.raw/*29.9*/("""</div>
        <div class="form-group">
          <input type="submit" value="Sign In" class="btn btn-primary" id="orangeButton">
        </div>
      </div>
      """)))}),format.raw/*34.8*/("""
    """),format.raw/*35.5*/("""</div>

    <div class="col-xs-6">
      <img src=""""),_display_(/*38.18*/routes/*38.24*/.Assets.versioned("images/like.png")),format.raw/*38.60*/("""" alt="Thanks for stopping by." class="img-responsive"/>
      <div id="circleText">
        <p>Thanks for stopping by!</p>
      </div>
    </div>
  </div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 01:30:04 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/login.scala.html
                  HASH: 2dfded7402cff3d59f300d6a1d03f913ca7d1f8c
                  MATRIX: 763->1|910->38|940->60|968->63|1010->97|1049->99|1079->103|1182->181|1219->210|1257->211|1294->221|1363->263|1381->272|1422->292|1459->302|1502->315|1537->324|1576->354|1615->355|1652->365|1723->409|1737->414|1779->435|1816->445|1861->460|1896->468|1993->539|2008->545|2081->609|2120->610|2157->620|2219->655|2355->770|2392->780|2470->831|2616->956|2653->966|2853->1136|2886->1142|2968->1197|2983->1203|3040->1239
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|48->18|49->19|51->21|51->21|51->21|51->21|52->22|53->23|54->24|55->25|57->27|58->28|59->29|64->34|65->35|68->38|68->38|68->38
                  -- GENERATED --
              */
          