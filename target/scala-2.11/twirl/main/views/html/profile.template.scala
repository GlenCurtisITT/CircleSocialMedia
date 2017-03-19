
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,models.users.Account,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, account: models.users.Account):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main("Circle - Profile", user, account)/*3.41*/{_display_(Seq[Any](format.raw/*3.42*/("""
  """),format.raw/*4.3*/("""<div class="row">
    <div class="col-xs-12">
      <div class="well">
        <h1 class="text text-center">Welcome - """),_display_(/*7.49*/user/*7.53*/.getName),format.raw/*7.61*/("""</h1>
      </div>
    </div>
  </div>

  <div class="row">
    <div class="col-xs-4">
      <div class="well">
        <img class="img-responsive" src=""""),_display_(/*15.43*/account/*15.50*/.getProfilePicture),format.raw/*15.68*/("""" alt="Profile Picture"/>
        <h2 class="whiteText">About Me</h2>
        <p class="whiteText">"""),_display_(/*17.31*/account/*17.38*/.getAboutMe),format.raw/*17.49*/("""</p>
        <a href=""""),_display_(/*18.19*/routes/*18.25*/.HomeController.updateProfile(account.getAccount_id)),format.raw/*18.77*/("""" class="btn-xs btn-primary" id="orangeButton">Edit Profile</a>
      </div>
    </div>
    <div class="col-xs-8">
      <div class="well">
        <h2 class="whiteText">Cover Photo</h2>
        <img class="img-responsive" src=""""),_display_(/*24.43*/account/*24.50*/.getCoverPhoto),format.raw/*24.64*/("""" alt="Cover Photo"/>
      </div>
    </div>
  </div>
  <div class="row">
    <div class="col-xs-9">

    </div>
    <div class="col-xs-3" id="marginBottom">
      <div class="well">
        <a href=""""),_display_(/*34.19*/routes/*34.25*/.HomeController.updateUser(user.getEmail)),format.raw/*34.66*/("""" class="btn-xs btn-primary btn-block">Update Account</a>
        <a href=""""),_display_(/*35.19*/routes/*35.25*/.HomeController.deleteAccount(user.getEmail)),format.raw/*35.69*/("""" class="btn-xs btn-danger btn-block" onclick="return confirmDel();">Delete Account</a>
      </div>
    </div>
  </div>

  <script>
          function confirmDel() """),format.raw/*41.33*/("""{"""),format.raw/*41.34*/("""
            """),format.raw/*42.13*/("""return confirm('Are you sure?');
          """),format.raw/*43.11*/("""}"""),format.raw/*43.12*/("""
  """),format.raw/*44.3*/("""</script>
""")))}))
      }
    }
  }

  def render(user:models.users.User,account:models.users.Account): play.twirl.api.HtmlFormat.Appendable = apply(user,account)

  def f:((models.users.User,models.users.Account) => play.twirl.api.HtmlFormat.Appendable) = (user,account) => apply(user,account)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 00:07:22 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/WebDevCa/app/views/profile.scala.html
                  HASH: 6c33abbba015ca693c8ff84ac68cf9736fddb7c7
                  MATRIX: 781->1|932->57|962->62|1009->101|1047->102|1077->106|1225->228|1237->232|1265->240|1454->402|1470->409|1509->427|1638->529|1654->536|1686->547|1737->571|1752->577|1825->629|2087->864|2103->871|2138->885|2377->1097|2392->1103|2454->1144|2558->1221|2573->1227|2638->1271|2837->1442|2866->1443|2908->1457|2980->1501|3009->1502|3040->1506
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|46->15|46->15|46->15|48->17|48->17|48->17|49->18|49->18|49->18|55->24|55->24|55->24|65->34|65->34|65->34|66->35|66->35|66->35|72->41|72->41|73->42|74->43|74->43|75->44
                  -- GENERATED --
              */
          