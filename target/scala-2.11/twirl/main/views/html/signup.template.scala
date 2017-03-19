
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

     object signup_Scope1 {
import helper._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.users.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addUserForm: Form[models.users.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.40*/("""

  """),_display_(/*4.4*/main("Circle - SignUp", null, null)/*4.39*/{_display_(Seq[Any](format.raw/*4.40*/("""
    """),_display_(/*5.6*/if(flash.containsKey("emailExists"))/*5.42*/{_display_(Seq[Any](format.raw/*5.43*/("""
      """),format.raw/*6.7*/("""<div class="row">
        <div class="col-xs-12">
          <p class="alert alert-warning">Email already exists.</p>
        </div>
      </div>
    """)))}),format.raw/*11.6*/("""
    """),_display_(/*12.6*/if(flash.containsKey("noAtSymbol"))/*12.41*/{_display_(Seq[Any](format.raw/*12.42*/("""
      """),format.raw/*13.7*/("""<div class="row">
        <div class="col-xs-12">
          <p class="alert alert-warning">No @ symbol found in Email.</p>
        </div>
      </div>
    """)))}),format.raw/*18.6*/("""
  """),format.raw/*19.3*/("""<div class="row">
    <div class="col-xs-12">
      <div class="well">
        <h3 class="whiteText">Sign Up</h3>
        <div class="panel panel-primary">
        """),_display_(/*24.10*/form(action = routes.HomeController.addUserSubmit(), 'class -> "panel-body", 'role -> "form")/*24.103*/{_display_(Seq[Any](format.raw/*24.104*/("""
          """),_display_(/*25.12*/inputText(addUserForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.87*/("""
          """),_display_(/*26.12*/inputText(addUserForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*26.89*/("""
          """),_display_(/*27.12*/inputPassword(addUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*27.99*/("""
          """),format.raw/*28.11*/("""<div class="actions">
            <input type="submit" value="Signup" class="btn btn-primary" id="orangeButton">
          </div>
        """)))}),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""</div>
      </div>
    </div>
  </div>
  """)))}))
      }
    }
  }

  def render(addUserForm:Form[models.users.User]): play.twirl.api.HtmlFormat.Appendable = apply(addUserForm)

  def f:((Form[models.users.User]) => play.twirl.api.HtmlFormat.Appendable) = (addUserForm) => apply(addUserForm)

  def ref: this.type = this

}


}
}

/**/
object signup extends signup_Scope0.signup_Scope1.signup
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 01:54:01 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/signup.scala.html
                  HASH: 303f5b598c50894b52f89f1c070a465ee576400c
                  MATRIX: 809->19|942->57|974->64|1017->99|1055->100|1087->107|1131->143|1169->144|1203->152|1388->307|1421->314|1465->349|1504->350|1539->358|1730->520|1761->524|1958->694|2061->787|2101->788|2141->801|2237->876|2277->889|2375->966|2415->979|2523->1066|2563->1078|2736->1220|2773->1230
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|38->5|38->5|39->6|44->11|45->12|45->12|45->12|46->13|51->18|52->19|57->24|57->24|57->24|58->25|58->25|59->26|59->26|60->27|60->27|61->28|64->31|65->32
                  -- GENERATED --
              */
          