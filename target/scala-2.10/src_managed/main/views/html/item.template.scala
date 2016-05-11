
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(header: String, msg: String,myForm: Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(Seq[Any](/*3.2*/main(header)/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

<div class="container">
	<h1>"""),_display_(Seq[Any](/*6.7*/header)),format.raw/*6.13*/("""</h1>
		<a class="btn btn-default" href="/" role="button">一覧に戻る</a>
		<a class="btn btn-default" href="/add" role="button">新規</a>
		<a class="btn btn-default" href="/find" role="button">投稿者検索</a>
		<a class="btn btn-default" href="/delete" role="button">削除</a>
	<hr>
	<p>"""),_display_(Seq[Any](/*12.6*/msg)),format.raw/*12.9*/("""</p>
	"""),_display_(Seq[Any](/*13.3*/helper/*13.9*/.form(action = routes.Application.edit)/*13.48*/ {_display_(Seq[Any](format.raw/*13.50*/("""
	    """),_display_(Seq[Any](/*14.7*/helper/*14.13*/.inputText(myForm("id"),args='_label->"id",'_error->"Invalid value"))),format.raw/*14.81*/("""
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
                    DATE: Wed May 11 16:52:29 JST 2016
                    SOURCE: /Users/hatsune.kitajima/Documents/play/dbtest/app/views/item.scala.html
                    HASH: 663ffcf3bb58665a6d45aee0d6537d22724c0743
                    MATRIX: 794->1|939->52|976->55|996->67|1035->69|1101->101|1128->107|1435->379|1459->382|1501->389|1515->395|1563->434|1603->436|1645->443|1660->449|1750->517|1924->660
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|46->18
                    -- GENERATED --
                */
            