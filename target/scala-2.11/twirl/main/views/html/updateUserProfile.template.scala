
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateUserProfile_Scope0 {
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

     object updateUserProfile_Scope1 {
import helper._

class updateUserProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.users.Account],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(accountForm: Form[models.users.Account]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.43*/("""

"""),_display_(/*4.2*/main("Circle - Update Profile", null, null)/*4.45*/{_display_(Seq[Any](format.raw/*4.46*/("""
  """),format.raw/*5.3*/("""<div class="col-xs-12">
    <div class="well">
      <h3 class="whiteText">Update Profile</h3>
      <div class="panel panel-primary">
      """),_display_(/*9.8*/form(action = routes.HomeController.updateUserProfileSubmit(), 'class -> "panel-body", 'role -> "form")/*9.111*/{_display_(Seq[Any](format.raw/*9.112*/("""
        """),_display_(/*10.10*/inputText(accountForm("account_id"), '_label -> "", 'hidden -> "hidden")),format.raw/*10.82*/("""
        """),_display_(/*11.10*/inputText(accountForm("aboutMe"), '_label -> "About", 'class -> "form-control")),format.raw/*11.89*/("""
        """),_display_(/*12.10*/inputText(accountForm("profilePicture"), '_label -> "Profile Picture (URL)", 'class -> "form-control")),format.raw/*12.112*/("""
        """),_display_(/*13.10*/inputText(accountForm("coverPhoto"), '_label -> "Cover Photo (URL)", 'class -> "form-control")),format.raw/*13.104*/("""
        """),format.raw/*14.9*/("""<div class="actions">
          <input type="submit" value="Update" class="btn btn-primary" id="orangeButton">
          <a href=""""),_display_(/*16.21*/routes/*16.27*/.HomeController.profile()),format.raw/*16.52*/("""" class="btn btn-warning">Cancel</a>
        </div>
      """)))}),format.raw/*18.8*/("""
      """),format.raw/*19.7*/("""</div>
    </div>
  </div>
""")))}))
      }
    }
  }

  def render(accountForm:Form[models.users.Account]): play.twirl.api.HtmlFormat.Appendable = apply(accountForm)

  def f:((Form[models.users.Account]) => play.twirl.api.HtmlFormat.Appendable) = (accountForm) => apply(accountForm)

  def ref: this.type = this

}


}
}

/**/
object updateUserProfile extends updateUserProfile_Scope0.updateUserProfile_Scope1.updateUserProfile
              /*
                  -- GENERATED --
                  DATE: Wed Dec 14 22:42:35 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/updateUserProfile.scala.html
                  HASH: f7766f5b59484786188333bfd6702186c3fbc0f0
                  MATRIX: 845->19|981->60|1011->65|1062->108|1100->109|1130->113|1301->259|1413->362|1452->363|1490->374|1583->446|1621->457|1721->536|1759->547|1883->649|1921->660|2037->754|2074->764|2234->897|2249->903|2295->928|2386->989|2421->997
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|42->9|42->9|42->9|43->10|43->10|44->11|44->11|45->12|45->12|46->13|46->13|47->14|49->16|49->16|49->16|51->18|52->19
                  -- GENERATED --
              */
          