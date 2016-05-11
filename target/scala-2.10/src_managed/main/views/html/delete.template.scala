
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
object delete extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(header: String, msg:String, myForm: Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(Seq[Any](/*3.2*/main(header)/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

<div class="container">
	<h1>"""),_display_(Seq[Any](/*6.7*/header)),format.raw/*6.13*/("""</h1>
	<a class="btn btn-default" href="/" role="button">一覧に戻る</a>
	<a class="btn btn-default" href="/add" role="button">新規</a>
	<a class="btn btn-default" href="/item" role="button">投稿編集</a>
	<a class="btn btn-default" href="/find" role="button">投稿者検索</a>
	<hr>
	<p>"""),_display_(Seq[Any](/*12.6*/msg)),format.raw/*12.9*/("""</p>
	"""),_display_(Seq[Any](/*13.3*/helper/*13.9*/.form(action = routes.Application.remove)/*13.50*/ {_display_(Seq[Any](format.raw/*13.52*/("""
	    """),_display_(Seq[Any](/*14.7*/helper/*14.13*/.inputText(myForm("id"),args='_label->"id"))),format.raw/*14.56*/("""
		<input type = "hidden" value = "dummy" name = "name">
	    <input type = "hidden" value = "dummy" name="message">	    
		<input type="submit">
	""")))})),format.raw/*18.3*/("""
</div>
""")))})))}
    }
    
    def render(header:String,msg:String,myForm:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(header,msg,myForm)
    
    def f:((String,String,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (header,msg,myForm) => apply(header,msg,myForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 17:37:07 JST 2016
                    SOURCE: /Users/hatsune.kitajima/Documents/play/dbtest/app/views/delete.scala.html
                    HASH: 08b7966c4b9575e5561c9f8e1d4c2049e94b4cd6
                    MATRIX: 796->1|941->52|978->55|998->67|1037->69|1103->101|1130->107|1433->375|1457->378|1499->385|1513->391|1563->432|1603->434|1645->441|1660->447|1725->490|1904->638
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|46->18
                    -- GENERATED --
                */
            