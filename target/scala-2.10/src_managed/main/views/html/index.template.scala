
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Anuncio],Contador,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anuncios: List[Anuncio])(contador: Contador):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.47*/("""

<html lang="">
    <head>
        <title>Help Musics</title>
        <meta charset="UTF-8">
        <meta name=description content="">
        <meta name=viewport content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap CSS -->
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" media="screen">

    </head>
    <body>
    <div class="container">
        <!-- Navbar -->
        <ul class="nav nav-tabs">
            <li class="active">
                <a href=""""),_display_(Seq[Any](/*19.27*/routes/*19.33*/.Application.index())),format.raw/*19.53*/("""">Home</a>
            </li>
            <li><a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Application.criar())),format.raw/*21.53*/("""" method="post">Criar Anúncio </a></li>
            <li><a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Application.pesquisa())),format.raw/*22.56*/("""" method="post">Pesquisar</a></li>
        </ul>

        <div class="jumbotron">
            <h1>Bem vindos ao Help Music</h1>

        </div>
    </div>
    <div class="content">
        <div class="col-sm-1"></div>
    	<div class="col-sm-10">

        <h2 class="text-center">"""),_display_(Seq[Any](/*34.34*/anuncios/*34.42*/.size())),format.raw/*34.49*/(""" anuncio(s)</h2>
        <h5 class="text-center">"""),_display_(Seq[Any](/*35.34*/contador/*35.42*/.getResolvido())),format.raw/*35.57*/(""" anuncio(s) resolvidos</h5>

                    """),_display_(Seq[Any](/*37.22*/for(anuncio <- anuncios) yield /*37.46*/ {_display_(Seq[Any](format.raw/*37.48*/("""
                    <details>
                        <summary>Título: """),_display_(Seq[Any](/*39.43*/anuncio/*39.50*/.getNome())),format.raw/*39.60*/("""</summary>
                        <p>Objetivo: """),_display_(Seq[Any](/*40.39*/anuncio/*40.46*/.getObjetivo())),format.raw/*40.60*/("""</p>
                        <p>Cidade: """),_display_(Seq[Any](/*41.37*/anuncio/*41.44*/.getCidade())),format.raw/*41.56*/(""" </p>
                        <p>Email: """),_display_(Seq[Any](/*42.36*/anuncio/*42.43*/.getEmail())),format.raw/*42.54*/("""</p>
                        <p>Facebook: """),_display_(Seq[Any](/*43.39*/anuncio/*43.46*/.getFace())),format.raw/*43.56*/("""</p>
                        <p>Instrumentos: </p>
                        """),_display_(Seq[Any](/*45.26*/for(i <- anuncio.getInstrumentos()) yield /*45.61*/{_display_(Seq[Any](format.raw/*45.62*/("""
                        <p> -> """),_display_(Seq[Any](/*46.33*/i)),format.raw/*46.34*/("""</p>""")))})),format.raw/*46.39*/("""
                        <p>Estilos que gosta: """),_display_(Seq[Any](/*47.48*/anuncio/*47.55*/.getEstilo_gosta)),format.raw/*47.71*/("""</p>
                        <p>Estilos que não gosta: """),_display_(Seq[Any](/*48.52*/anuncio/*48.59*/.getEstilo_nao_gosta)),format.raw/*48.79*/("""</p>
                        <p> <form action=""""),_display_(Seq[Any](/*49.44*/routes/*49.50*/.Application.deleteAnuncio(anuncio.getId()))),format.raw/*49.93*/("""" method="post" role="form">
                            <label>
                            <input type="password" name="codigo" id="codigo" class="form-control" required="required">Código</label>
                            <div class="radio">
                                <label><input value="1" name="optradio" type="radio" required="required">Resolvido</label>
                            </div>
                            <div class="radio">
                                <label><input value="0" name="optradio" type="radio">Não resolvido</label>
                            </div>

                            <input type="submit" id="d" class="btn btn-danger" value="Delete" onclick="myFunction()">

                    </form></p>



                    <script>
                        function myFunction()"""),format.raw/*66.46*/("""{"""),format.raw/*66.47*/("""
                            var str1 = $("#inputCodigo").val();
                            var str2 = """),_display_(Seq[Any](/*68.41*/anuncio/*68.48*/.getCodigo())),format.raw/*68.60*/(""";
                            var n = str1.localeCompare(str2);
                            if( n != 0)
                                alert("Digite seu código corretamente!");
                        """),format.raw/*72.25*/("""}"""),format.raw/*72.26*/("""
                    </script>


                    """)))})),format.raw/*76.22*/("""
                        </details>
        </div>
    </div>
    <div class="content">
        <div class="col-sm-5"></div>
        <div class="col-sm-7">
            <form action=""""),_display_(Seq[Any](/*83.28*/routes/*83.34*/.Application.criar())),format.raw/*83.54*/("""" method="post">
            <input type="submit" class="btn btn-success btn-mini" value="Criar Anúncio"></form>
        </div>
    </div>


        <!-- jQuery -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    </body>
</html>

    
"""))}
    }
    
    def render(anuncios:List[Anuncio],contador:Contador): play.api.templates.HtmlFormat.Appendable = apply(anuncios)(contador)
    
    def f:((List[Anuncio]) => (Contador) => play.api.templates.HtmlFormat.Appendable) = (anuncios) => (contador) => apply(anuncios)(contador)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 03 14:04:37 BRT 2015
                    SOURCE: /home/paulo/Documentos/SI1/play-bd-e-testes/app/views/index.scala.html
                    HASH: ed57fdb9c5e04e01a5cc1332ea3f922ac03d2341
                    MATRIX: 790->1|929->46|1578->659|1593->665|1635->685|1726->740|1741->746|1783->766|1885->832|1900->838|1945->861|2262->1142|2279->1150|2308->1157|2394->1207|2411->1215|2448->1230|2534->1280|2574->1304|2614->1306|2723->1379|2739->1386|2771->1396|2856->1445|2872->1452|2908->1466|2985->1507|3001->1514|3035->1526|3112->1567|3128->1574|3161->1585|3240->1628|3256->1635|3288->1645|3400->1721|3451->1756|3490->1757|3559->1790|3582->1791|3619->1796|3703->1844|3719->1851|3757->1867|3849->1923|3865->1930|3907->1950|3991->1998|4006->2004|4071->2047|4922->2870|4951->2871|5092->2976|5108->2983|5142->2995|5372->3197|5401->3198|5487->3252|5706->3435|5721->3441|5763->3461
                    LINES: 26->1|29->1|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|62->34|62->34|62->34|63->35|63->35|63->35|65->37|65->37|65->37|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|94->66|94->66|96->68|96->68|96->68|100->72|100->72|104->76|111->83|111->83|111->83
                    -- GENERATED --
                */
            