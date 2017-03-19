
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.users.User],List[models.users.Account],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: List[models.users.User], account: List[models.users.Account]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

  """),_display_(/*3.4*/main("Circle - Search", null, null)/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""
    """),format.raw/*4.5*/("""<div class="col-xs-12">
      <table class="table table-bordered table-hover table-condensed" id="table1">
        <thead>
          <tr>
            <th>Name</th>
            <th>Email</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
        """),_display_(/*14.10*/for(u <- user) yield /*14.24*/ {_display_(Seq[Any](format.raw/*14.26*/("""
          """),format.raw/*15.11*/("""<tr>
            <td>"""),_display_(/*16.18*/u/*16.19*/.getName),format.raw/*16.27*/("""</td>
            <td>"""),_display_(/*17.18*/u/*17.19*/.getEmail),format.raw/*17.28*/("""</td>
            <td><a href=""""),_display_(/*18.27*/routes/*18.33*/.HomeController.otherProfileGenerate(u.getEmail)),format.raw/*18.81*/("""" id="orangeText">Profile Page</a></td>
        """)))}),format.raw/*19.10*/("""
          """),format.raw/*20.11*/("""</tr>
        </tbody>
      </table>
    </div>
  """)))}))
      }
    }
  }

  def render(user:List[models.users.User],account:List[models.users.Account]): play.twirl.api.HtmlFormat.Appendable = apply(user,account)

  def f:((List[models.users.User],List[models.users.Account]) => play.twirl.api.HtmlFormat.Appendable) = (user,account) => apply(user,account)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Sun Dec 11 21:58:52 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/search.scala.html
                  HASH: d99aee58bb71b7c91249869c362623346ac98605
                  MATRIX: 791->1|954->69|986->76|1029->111|1068->113|1100->119|1408->400|1438->414|1478->416|1518->428|1568->451|1578->452|1607->460|1658->484|1668->485|1698->494|1758->527|1773->533|1842->581|1923->631|1963->643
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|51->20
                  -- GENERATED --
              */
          