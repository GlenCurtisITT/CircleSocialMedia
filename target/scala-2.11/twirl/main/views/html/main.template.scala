
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,models.users.User,models.users.Account,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User, account:models.users.Account)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.87*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
    """),format.raw/*7.5*/("""<title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*8.102*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
    <link href="https://fonts.googleapis.com/css?family=Abril+Fatface" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*25.52*/routes/*25.58*/.HomeController.index()),format.raw/*25.81*/("""">Circle</a>
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbar-collapse-2">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href=""""),_display_(/*31.39*/routes/*31.45*/.HomeController.about()),format.raw/*31.68*/("""">About</a></li>
                        <li><a href=""""),_display_(/*32.39*/routes/*32.45*/.HomeController.search()),format.raw/*32.69*/("""">Search</a></li>
                        <li><a href=""""),_display_(/*33.39*/routes/*33.45*/.HomeController.profile()),format.raw/*33.70*/("""">My Profile</a></li>
                        <li>
                        """),_display_(/*35.26*/if(user != null)/*35.42*/{_display_(Seq[Any](format.raw/*35.43*/("""
                            """),format.raw/*36.29*/("""<a class="btn btn-default btn-outline btn-circle" id="orangeButton"  href=""""),_display_(/*36.105*/routes/*36.111*/.LoginController.logout()),format.raw/*36.136*/("""">Logout</a>
                        """)))}/*37.26*/else/*37.31*/{_display_(Seq[Any](format.raw/*37.32*/("""
                            """),format.raw/*38.29*/("""<a class="btn btn-default btn-outline btn-circle" id="orangeButton" href=""""),_display_(/*38.104*/routes/*38.110*/.LoginController.login()),format.raw/*38.134*/("""">Login</a>
                        """)))}),format.raw/*39.26*/("""
                        """),format.raw/*40.25*/("""</li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container -->
        </nav><!-- /.navbar -->

        <div class="container"><!-- Content from other html pages here-->
            """),_display_(/*47.14*/content),format.raw/*47.21*/("""
        """),format.raw/*48.9*/("""</div>

        <footer>
            <div class="container" id="footerContainer">
                <div class="container">
                    <a href="https://www.facebook.com/ccandcdesign">Proudly created by CC&C Design</a>
                </div>
            </div>
        </footer>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script><!--Make Jscript + bootstrap js work -->
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*59.74*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,account:models.users.Account,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user,account)(content)

  def f:((String,models.users.User,models.users.Account) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user,account) => (content) => apply(title,user,account)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 01:59:47 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/main.scala.html
                  HASH: 32b2b5902d24696dc0e83d143ae2f1469ff4056c
                  MATRIX: 787->1|967->86|997->90|1079->198|1111->204|1145->212|1170->217|1255->276|1269->282|1336->328|1415->381|1429->387|1490->428|1575->486|1590->492|1651->531|2550->1403|2565->1409|2609->1432|2946->1742|2961->1748|3005->1771|3088->1827|3103->1833|3148->1857|3232->1914|3247->1920|3293->1945|3398->2023|3423->2039|3462->2040|3520->2070|3624->2146|3640->2152|3687->2177|3745->2216|3758->2221|3797->2222|3855->2252|3958->2327|3974->2333|4020->2357|4089->2395|4143->2421|4417->2668|4445->2675|4482->2685|4965->3141|4980->3147|5046->3192
                  LINES: 27->1|32->1|34->3|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|56->25|56->25|56->25|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|66->35|66->35|66->35|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|70->39|71->40|78->47|78->47|79->48|90->59|90->59|90->59
                  -- GENERATED --
              */
          