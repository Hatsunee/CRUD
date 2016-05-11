
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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Long,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(header: String, msg: String, id:Long, myForm: Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.63*/("""

"""),_display_(Seq[Any](/*3.2*/main(header)/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

<div class="container">
	<h1>"""),_display_(Seq[Any](/*6.7*/header)),format.raw/*6.13*/("""</h1>
		<a class="btn btn-default" href="/" role="button">一覧に戻る</a>
		<a class="btn btn-default" href="/add" role="button">新規</a>
		<a class="btn btn-default" href="/item" role="button">投稿編集</a>
		<a class="btn btn-default" href="/find" role="button">投稿者検索</a>
		<a class="btn btn-default" href="/delete" role="button">削除</a>
	<hr>
	<p>"""),_display_(Seq[Any](/*13.6*/msg)),format.raw/*13.9*/("""</p>
	"""),_display_(Seq[Any](/*14.3*/helper/*14.9*/.form(action = routes.Application.update)/*14.50*/ {_display_(Seq[Any](format.raw/*14.52*/("""
		<input type="hidden" name="id" id="id" value=""""),_display_(Seq[Any](/*15.50*/id)),format.raw/*15.52*/("""" >
	    """),_display_(Seq[Any](/*16.7*/helper/*16.13*/.inputText(myForm("name"),args='_label->"name",'_help->"Required"))),format.raw/*16.79*/("""
	   	"""),_display_(Seq[Any](/*17.7*/helper/*17.13*/.inputText(myForm("mail"),args='_label->"mail",'_help->"Email"))),format.raw/*17.76*/("""
		"""),_display_(Seq[Any](/*18.4*/helper/*18.10*/.textarea(myForm("message"), args='rows->2 ,'cols -> 20,'_label->"message",'_help->"constraint.pattern"))),format.raw/*18.114*/("""
 		<input type="submit">
	""")))})),format.raw/*20.3*/("""
</div>

""")))})),format.raw/*23.2*/("""	"""))}
    }
    
    def render(header:String,msg:String,id:Long,myForm:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(header,msg,id,myForm)
    
    def f:((String,String,Long,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (header,msg,id,myForm) => apply(header,msg,id,myForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 18:12:43 JST 2016
                    SOURCE: /Users/hatsune.kitajima/Documents/play/dbtest/app/views/edit.scala.html
                    HASH: bd199bc0a4d4c72d2a95ef2a952e26fe432dd8f7
                    MATRIX: 799->1|954->62|991->65|1011->77|1050->79|1116->111|1143->117|1515->454|1539->457|1581->464|1595->470|1645->511|1685->513|1771->563|1795->565|1840->575|1855->581|1943->647|1985->654|2000->660|2085->723|2124->727|2139->733|2266->837|2325->865|2366->875
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|51->23
                    -- GENERATED --
                */
            