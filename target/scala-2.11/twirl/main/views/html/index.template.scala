
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,models.users.Account,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, account:models.users.Account):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
    """),_display_(/*2.6*/main("Circle - Home", user, account)/*2.42*/ {_display_(Seq[Any](format.raw/*2.44*/("""
        """),_display_(/*3.10*/if(flash.containsKey("created"))/*3.42*/{_display_(Seq[Any](format.raw/*3.43*/("""
            """),format.raw/*4.13*/("""<div class="row">
                <div class="col-xs-12">
                    <h2 class="text-center" id="orangeText">User has been created. Please login to see your account.</h2>
                </div>
            </div>
        """)))}),format.raw/*9.10*/("""
        """),_display_(/*10.10*/if(flash.containsKey("logout"))/*10.41*/{_display_(Seq[Any](format.raw/*10.42*/("""
            """),format.raw/*11.13*/("""<div class="row">
                <div class="col-xs-12">
                    <h2 class="text-center" id="orangeText">You have been successfully logged out.</h2>
                </div>
            </div>
        """)))}),format.raw/*16.10*/("""
        """),_display_(/*17.10*/if(flash.containsKey("deleted"))/*17.42*/{_display_(Seq[Any](format.raw/*17.43*/("""
            """),format.raw/*18.13*/("""<div class="row">
                <div class="col-xs-12">
                    <h2 class="text-center" id="orangeText">Account successfully deleted.</h2>
                </div>
            </div>
        """)))}),format.raw/*23.10*/("""
        """),format.raw/*24.9*/("""<div class="row">
            <div class="col-xs-12">
                    <img src=""""),_display_(/*26.32*/routes/*26.38*/.Assets.versioned("images/circleLogo.png")),format.raw/*26.80*/("""" alt="Circle Logo" class="img-responsive center-block"/>
                <div id="circleText">
                    <p>The innovative new social media.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-3">
            </div>
            """),_display_(/*35.14*/if(user == null)/*35.30*/{_display_(Seq[Any](format.raw/*35.31*/("""
                """),format.raw/*36.17*/("""<div class="col-xs-6" id="marginTop">
                    <a class="btn btn-primary center-block" id="orangeButton" href=""""),_display_(/*37.86*/routes/*37.92*/.HomeController.signup()),format.raw/*37.116*/("""">Sign-up to Circle</a>
                </div>
            """)))}/*39.14*/else/*39.18*/{_display_(Seq[Any](format.raw/*39.19*/("""
                """),format.raw/*40.17*/("""<div class="col-xs-6" id="marginTop">
                    <a class="btn btn-primary center-block" id="orangeButton" href=""""),_display_(/*41.86*/routes/*41.92*/.HomeController.profile()),format.raw/*41.117*/("""">Go to profile</a>
                </div>
            """)))}),format.raw/*43.14*/("""
            """),format.raw/*44.13*/("""<div class="col-xs-3">
            </div>
        </div>
    """)))}),format.raw/*47.6*/("""
"""))
      }
    }
  }

  def render(user:models.users.User,account:models.users.Account): play.twirl.api.HtmlFormat.Appendable = apply(user,account)

  def f:((models.users.User,models.users.Account) => play.twirl.api.HtmlFormat.Appendable) = (user,account) => apply(user,account)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 01:06:56 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/index.scala.html
                  HASH: fa74c85afb7f2e2d171be710f3860aef40bdcaab
                  MATRIX: 777->1|927->56|959->63|1003->99|1042->101|1079->112|1119->144|1157->145|1198->159|1464->395|1502->406|1542->437|1581->438|1623->452|1872->670|1910->681|1951->713|1990->714|2032->728|2272->937|2309->947|2423->1034|2438->1040|2501->1082|2843->1397|2868->1413|2907->1414|2953->1432|3104->1556|3119->1562|3165->1586|3246->1648|3259->1652|3298->1653|3344->1671|3495->1795|3510->1801|3557->1826|3646->1884|3688->1898|3783->1963
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4|40->9|41->10|41->10|41->10|42->11|47->16|48->17|48->17|48->17|49->18|54->23|55->24|57->26|57->26|57->26|66->35|66->35|66->35|67->36|68->37|68->37|68->37|70->39|70->39|70->39|71->40|72->41|72->41|72->41|74->43|75->44|78->47
                  -- GENERATED --
              */
          