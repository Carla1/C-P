
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
object pesquisar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Anuncio],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anuncios: List[Anuncio]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

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
        <li><a href=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Application.index())),format.raw/*18.49*/("""">Home</a>
        </li>
        <li><a href=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Application.criar())),format.raw/*20.49*/("""" method="post">Criar Anúncio </a></li>
        <li class="active"><a href=""""),_display_(Seq[Any](/*21.38*/routes/*21.44*/.Application.pesquisa())),format.raw/*21.67*/("""" method="post">Pesquisar</a></li>
    </ul>

    <div class="jumbotron">
        <h1>Pesquisar Anúncios</h1>

        <table class="table table-hover">
            <tr><label>Pesquisar por: </label></tr>
            <tr>
            <form action=""""),_display_(Seq[Any](/*30.28*/routes/*30.34*/.Application.pesquisarAnuncio())),format.raw/*30.65*/("""" method="post">
                        <div class="radio">

                            <label><input value="1" name="optradio" type="radio" required="required"> Título</label>
                            <input type="text" name="pesquisa" required="required"/>
                            <input type="submit" name="botao_pesquisar" class="btn btn-success" value="Pesquisar">

                        </div>
            </form>
            </tr>

            <tr>
            <form action=""""),_display_(Seq[Any](/*42.28*/routes/*42.34*/.Application.pesquisarAnuncio())),format.raw/*42.65*/("""" method="post">
                    <div class="radio">

                            <label><input value="2" name="optradio" type="radio"> Instrumento     </label>
                            <input type="text" name="pesquisa" required="required"/>
                            <input type="submit" name="botao_pesquisar" class="btn btn-success" value="Pesquisar">
                    </div>
            </form>
            </tr>

            <tr>
            <form action=""""),_display_(Seq[Any](/*53.28*/routes/*53.34*/.Application.pesquisarAnuncio())),format.raw/*53.65*/("""" method="post">
                    <div class="radio">
                            <label><input value="3" name="optradio" type="radio"> Estilo que gosta</label>
                            <input type="text" name="pesquisa" required="required"/>
                            <input type="submit" name="botao_pesquisar" class="btn btn-success" value="Pesquisar">
                    </div>
            </form>
            </tr>

            <tr>
            <form action=""""),_display_(Seq[Any](/*63.28*/routes/*63.34*/.Application.pesquisarAnuncio())),format.raw/*63.65*/("""" method="post">

                     <div class="radio">
                         <label><input value="4" name="optradio" type="radio"> Objetivo        </label>
                         <input  list="objetivo" name="objetivo" required="required">
                         <datalist id="objetivo">
                             <option value="Tocar Ocasionalmente">
                             <option value="Procuro Banda">
                             <option value="Procuro musico">
                             </datalist>
                         <input type="submit" name="botao_pesquisar" class="btn btn-success" value="Pesquisar">
                     </div>
            </form>
            </tr>



           </table>
    </div>
</div>
<div class="content">
    <div class="col-sm-1"></div>
    <div class="col-sm-10">
        <h2 class="text-center">"""),_display_(Seq[Any](/*86.34*/anuncios/*86.42*/.size())),format.raw/*86.49*/(""" anuncio(s) encontrados no total</h2>




        """),_display_(Seq[Any](/*91.10*/for(anuncio <- anuncios) yield /*91.34*/ {_display_(Seq[Any](format.raw/*91.36*/("""
        <details>
            <summary>Título: """),_display_(Seq[Any](/*93.31*/anuncio/*93.38*/.getNome())),format.raw/*93.48*/("""</summary>
            <p>Objetivo: """),_display_(Seq[Any](/*94.27*/anuncio/*94.34*/.getObjetivo())),format.raw/*94.48*/("""</p>
            <p>Cidade: """),_display_(Seq[Any](/*95.25*/anuncio/*95.32*/.getCidade())),format.raw/*95.44*/(""" </p>
            <p>Email: """),_display_(Seq[Any](/*96.24*/anuncio/*96.31*/.getEmail())),format.raw/*96.42*/("""</p>
            <p>Facebook: """),_display_(Seq[Any](/*97.27*/anuncio/*97.34*/.getFace())),format.raw/*97.44*/("""</p>
            <p>Instrumentos: """),_display_(Seq[Any](/*98.31*/anuncio/*98.38*/.getInstrumentos())),format.raw/*98.56*/("""</p>
            <p>Estilos que gosta: """),_display_(Seq[Any](/*99.36*/anuncio/*99.43*/.getEstilo_gosta)),format.raw/*99.59*/("""</p>
            <p>Estilos que não gosta: """),_display_(Seq[Any](/*100.40*/anuncio/*100.47*/.getEstilo_nao_gosta)),format.raw/*100.67*/("""</p>
        """)))})),format.raw/*101.10*/("""
        </details>
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
    
    def render(anuncios:List[Anuncio]): play.api.templates.HtmlFormat.Appendable = apply(anuncios)
    
    def f:((List[Anuncio]) => play.api.templates.HtmlFormat.Appendable) = (anuncios) => apply(anuncios)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 03 14:25:45 BRT 2015
                    SOURCE: /home/paulo/Documentos/SI1/play-bd-e-testes/app/views/pesquisar.scala.html
                    HASH: 519794f5c606909dcea16774e8ac4d996e8559d3
                    MATRIX: 785->1|904->26|1465->551|1480->557|1522->577|1605->624|1620->630|1662->650|1775->727|1790->733|1835->756|2120->1005|2135->1011|2188->1042|2718->1536|2733->1542|2786->1573|3297->2048|3312->2054|3365->2085|3875->2559|3890->2565|3943->2596|4842->3459|4859->3467|4888->3474|4975->3525|5015->3549|5055->3551|5140->3600|5156->3607|5188->3617|5261->3654|5277->3661|5313->3675|5378->3704|5394->3711|5428->3723|5493->3752|5509->3759|5542->3770|5609->3801|5625->3808|5657->3818|5728->3853|5744->3860|5784->3878|5860->3918|5876->3925|5914->3941|5995->3985|6012->3992|6055->4012|6102->4026
                    LINES: 26->1|29->1|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|58->30|58->30|58->30|70->42|70->42|70->42|81->53|81->53|81->53|91->63|91->63|91->63|114->86|114->86|114->86|119->91|119->91|119->91|121->93|121->93|121->93|122->94|122->94|122->94|123->95|123->95|123->95|124->96|124->96|124->96|125->97|125->97|125->97|126->98|126->98|126->98|127->99|127->99|127->99|128->100|128->100|128->100|129->101
                    -- GENERATED --
                */
            