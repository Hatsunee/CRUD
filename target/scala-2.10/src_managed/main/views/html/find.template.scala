
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
object find extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[String],List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(header: String, myForm: Form[String], datas:List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.61*/("""

"""),_display_(Seq[Any](/*3.2*/main(header)/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

<div class="container">
	<h1>"""),_display_(Seq[Any](/*6.7*/header)),format.raw/*6.13*/("""</h1>
		<a class="btn btn-default" href="/" role="button">一覧に戻る</a>
		<a class="btn btn-default" href="/add" role="button">新規</a>
		<a class="btn btn-default" href="/item" role="button">投稿編集</a>
		<a class="btn btn-default" href="/delete" role="button">削除</a>
	<hr>
	<p>投稿の検索</p>
	"""),_display_(Seq[Any](/*13.3*/helper/*13.9*/.form(action = routes.Application.find)/*13.48*/ {_display_(Seq[Any](format.raw/*13.50*/("""
	    """),_display_(Seq[Any](/*14.7*/helper/*14.13*/.inputText(myForm("input"), args='_label->"input", '_help->"Required", '_error->"This field is required"))),format.raw/*14.118*/("""
		<input type="submit">
	""")))})),format.raw/*16.3*/("""
	<hr/>
	  <pre-wrap>"""),_display_(Seq[Any](/*18.15*/datas)),format.raw/*18.20*/("""</pre-wrap>
</div>

""")))})))}
    }
    
    def render(header:String,myForm:Form[String],datas:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(header,myForm,datas)
    
    def f:((String,Form[String],List[Message]) => play.api.templates.HtmlFormat.Appendable) = (header,myForm,datas) => apply(header,myForm,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 17:42:28 JST 2016
                    SOURCE: /Users/hatsune.kitajima/Documents/play/dbtest/app/views/find.scala.html
                    HASH: 31e0f05a9e5e5c10707af838e1ca71b73404b2d6
                    MATRIX: 800->1|953->60|990->63|1010->75|1049->77|1115->109|1142->115|1459->397|1473->403|1521->442|1561->444|1603->451|1618->457|1746->562|1804->589|1862->611|1889->616
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|41->13|41->13|41->13|41->13|42->14|42->14|42->14|44->16|46->18|46->18
                    -- GENERATED --
                */
            