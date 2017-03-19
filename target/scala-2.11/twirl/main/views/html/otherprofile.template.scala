
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object otherprofile_Scope0 {
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

class otherprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.Account,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(account: models.users.Account, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main("Circle - Other Profile", user, account)/*3.47*/{_display_(Seq[Any](format.raw/*3.48*/("""

    """),format.raw/*5.5*/("""<div class="row">
        <div class="col-xs-4">
            <div class="well">
                <h2 class="whiteText">"""),_display_(/*8.40*/user/*8.44*/.getName),format.raw/*8.52*/("""</h2>
                <img class="img-responsive" src=""""),_display_(/*9.51*/account/*9.58*/.getProfilePicture),format.raw/*9.76*/("""" alt="Profile Picture"/>
                <h2 class="whiteText">About Me</h2>
                <p class="whiteText">"""),_display_(/*11.39*/account/*11.46*/.getAboutMe),format.raw/*11.57*/("""</p>
            </div>
        </div>
        <div class="col-xs-8">
            <div class="well">
                <h2 class="whiteText">Cover Photo</h2>
                <img class="img-responsive" src=""""),_display_(/*17.51*/account/*17.58*/.getCoverPhoto),format.raw/*17.72*/("""" alt="Cover Photo"/>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(account:models.users.Account,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(account,user)

  def f:((models.users.Account,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (account,user) => apply(account,user)

  def ref: this.type = this

}


}

/**/
object otherprofile extends otherprofile_Scope0.otherprofile
              /*
                  -- GENERATED --
                  DATE: Wed Dec 14 22:44:12 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/otherprofile.scala.html
                  HASH: 3c25a73c1f9b495961e62188961f0e011b4e7630
                  MATRIX: 791->1|942->57|972->62|1025->107|1063->108|1097->116|1245->238|1257->242|1285->250|1368->307|1383->314|1421->332|1566->450|1582->457|1614->468|1853->680|1869->687|1904->701
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|40->9|40->9|40->9|42->11|42->11|42->11|48->17|48->17|48->17
                  -- GENERATED --
              */
          