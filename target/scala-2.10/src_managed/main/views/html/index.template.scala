
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(header: String, datas: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""

"""),_display_(Seq[Any](/*3.2*/main("Hello, SingleMode!!")/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""

	<div class="container">
		<hr>
		<h1>"""),_display_(Seq[Any](/*7.8*/header)),format.raw/*7.14*/("""</h1>
			<a class="btn btn-default" href="/add" role="button">新規</a>
			<a class="btn btn-default" href="/item" role="button">投稿編集</a>
			<a class="btn btn-default" href="/delete" role="button">削除</a>
			<a class="btn btn-default" href="/find" role="button">投稿者検索</a>
		<hr>
		<p>データベースサンプル（Single）</p>
		<p>DBサンプル</p>
		<pre-wrap>"""),_display_(Seq[Any](/*15.14*/datas)),format.raw/*15.19*/("""</pre-wrap>
	</div>

""")))})))}
    }
    
    def render(header:String,datas:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(header,datas)
    
    def f:((String,List[Message]) => play.api.templates.HtmlFormat.Appendable) = (header,datas) => apply(header,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 10 15:06:45 JST 2016
                    SOURCE: /Users/hatsune.kitajima/Documents/play/dbtest/app/views/index.scala.html
                    HASH: 60abebe2a5be62cd008dd0a3d9fcd35c5808ef9d
                    MATRIX: 788->1|920->39|957->42|992->69|1030->70|1105->111|1132->117|1500->449|1527->454
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|43->15|43->15
                    -- GENERATED --
                */
            