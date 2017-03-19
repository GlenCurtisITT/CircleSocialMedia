
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object update_Scope0 {
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

     object update_Scope1 {
import helper._

class update extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.users.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addUserForm: Form[models.users.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.40*/("""

"""),_display_(/*4.2*/main("Circle - Update", null, null)/*4.37*/{_display_(Seq[Any](format.raw/*4.38*/("""
  """),format.raw/*5.3*/("""<div class="col-xs-12">
    <div class="well">
      <h3 class="whiteText">Update Account</h3>
      <div class="panel panel-primary">
      """),_display_(/*9.8*/form(action = routes.HomeController.updateUserSubmit(), 'class -> "panel-body", 'role -> "form")/*9.104*/{_display_(Seq[Any](format.raw/*9.105*/("""
        """),_display_(/*10.10*/inputText(addUserForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.85*/("""
        """),_display_(/*11.10*/inputText(addUserForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*11.77*/("""
        """),_display_(/*12.10*/inputPassword(addUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*12.97*/("""
        """),format.raw/*13.9*/("""<div class="actions">
          <input type="submit" value="Update" class="btn btn-primary" id="orangeButton">
          <a href=""""),_display_(/*15.21*/routes/*15.27*/.HomeController.profile()),format.raw/*15.52*/("""" class="btn btn-warning">Cancel</a>
        </div>
      """)))}),format.raw/*17.8*/("""
      """),format.raw/*18.7*/("""</div>
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
object update extends update_Scope0.update_Scope1.update
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 02:34:09 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/update.scala.html
                  HASH: 685881c1b9f040395108458eb82cf751fdbadb13
                  MATRIX: 809->19|942->57|972->62|1015->97|1053->98|1083->102|1254->248|1359->344|1398->345|1436->356|1532->431|1570->442|1658->509|1696->520|1804->607|1841->617|2001->750|2016->756|2062->781|2153->842|2188->850
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|42->9|42->9|42->9|43->10|43->10|44->11|44->11|45->12|45->12|46->13|48->15|48->15|48->15|50->17|51->18
                  -- GENERATED --
              */
          