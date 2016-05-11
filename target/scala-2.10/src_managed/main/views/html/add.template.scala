
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(header: String, msg: String ,myForm: Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.54*/("""

"""),_display_(Seq[Any](/*3.2*/main(header)/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

<div class="container">
	<h1>"""),_display_(Seq[Any](/*6.7*/header)),format.raw/*6.13*/("""</h1>
		<a class="btn btn-default" href="/" role="button">一覧に戻る</a>
		<a class="btn btn-default" href="/item" role="button">投稿編集</a>
		<a class="btn btn-default" href="/delete" role="button">削除</a>
		<a class="btn btn-default" href="/find" role="button">投稿者検索</a>
	<hr>
	<p>"""),_display_(Seq[Any](/*12.6*/msg)),format.raw/*12.9*/("""</p>

	"""),_display_(Seq[Any](/*14.3*/helper/*14.9*/.form(action = routes.Application.create)/*14.50*/ {_display_(Seq[Any](format.raw/*14.52*/("""
	    """),_display_(Seq[Any](/*15.7*/helper/*15.13*/.inputText(myForm("name"),args='_label->"name",'_help->"Required"))),format.raw/*15.79*/("""
	   	"""),_display_(Seq[Any](/*16.7*/helper/*16.13*/.inputText(myForm("mail"),args='_label->"mail",'_help->"Email"))),format.raw/*16.76*/("""
		"""),_display_(Seq[Any](/*17.4*/helper/*17.10*/.textarea(myForm("message"), args='rows->2 ,'cols -> 20,'_label->"message",'_help->"constraint.pattern"))),format.raw/*17.114*/("""
		<input type="submit">
	""")))})),format.raw/*19.3*/("""

</div>
""")))})))}
    }
    
    def render(header:String,msg:String,myForm:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(header,msg,myForm)
    
    def f:((String,String,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (header,msg,myForm) => apply(header,msg,myForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 15:36:43 JST 2016
                    SOURCE: /Users/hatsune.kitajima/Documents/play/dbtest/app/views/add.scala.html
                    HASH: 4980ad46f6a3bd26e69b877de030b6186fc0c8b7
                    MATRIX: 793->1|939->53|976->56|996->68|1035->70|1101->102|1128->108|1438->383|1462->386|1505->394|1519->400|1569->441|1609->443|1651->450|1666->456|1754->522|1796->529|1811->535|1896->598|1935->602|1950->608|2077->712|2135->739
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|40->12|40->12|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|47->19
                    -- GENERATED --
                */
            