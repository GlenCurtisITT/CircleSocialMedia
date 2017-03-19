
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,models.users.Account,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, account:models.users.Account):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
"""),_display_(/*2.2*/main("Circle - About", user, account)/*2.39*/ {_display_(Seq[Any](format.raw/*2.41*/("""
    """),format.raw/*3.5*/("""<div class="row">
        <div class="col-xs-6">
            <div class="well">
                <h2 class="orangeText">About Circle.</h2>
                <p class="orangeText">Circle was created as part of a student project in ITT Dublin. This project was part of the Web Design and Development
                class and was our 2nd Continuous Assessment. The students listed below are the people who created this website. We are overall very happy on
                how the site turned out and we are looking forward to adding more functionality in the future. All images used on this site are covered under
                the fair use agreement and any images used on profile pages link to there respected websites where they are hosted. This site will never be used
                for commercial gains.</p>
                <h2 class="orangeText">X00101556 - Glen Curtis</h2>
                <h2 class="orangeText">X00131787 - Glen Connolly</h2>
                <h2 class="orangeText">X00128242 - Evan Conlon</h2>
                <a href="http://www.it-tallaght.ie/">ITT Dublin Website</a>
            </div>
        </div>
        <div class="col-xs-6">
            <img src=""""),_display_(/*19.24*/routes/*19.30*/.Assets.versioned("images/circleLogo.png")),format.raw/*19.72*/("""" alt="Circle Logo" class="img-responsive"/>
        </div>
    </div>
""")))}),format.raw/*22.2*/("""
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
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 02:29:36 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/about.scala.html
                  HASH: 0befb2fee438a79aecaa06f52097e0e3e3ba720d
                  MATRIX: 777->1|927->56|955->59|1000->96|1039->98|1071->104|2297->1303|2312->1309|2375->1351|2480->1426
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|50->19|50->19|50->19|53->22
                  -- GENERATED --
              */
          