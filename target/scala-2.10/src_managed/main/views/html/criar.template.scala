
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
object criar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Anuncio],play.api.templates.HtmlFormat.Appendable] {

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
            <li >
                <a href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Application.anuncios())),format.raw/*18.56*/("""">Home</a>
            </li>
            <li class="active"><a href=""""),_display_(Seq[Any](/*20.42*/routes/*20.48*/.Application.criar())),format.raw/*20.68*/("""">Criar Anúncio</a></li>
            <li><a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Application.pesquisa())),format.raw/*21.56*/("""" method="post">Pesquisar</a></li>

        </ul>

        <div class="jumbotron">
            <h1>Bem vindos ao Help Music</h1>
            <p>Crie seu anúncio</p>
        </div>
    </div>
        <div class="col-sm-1"></div>
		<div class="col-sm-10">
        <h2>Criar Anúncio</h2>
        <form action=""""),_display_(Seq[Any](/*33.24*/routes/*33.30*/.Application.newAnuncio())),format.raw/*33.55*/("""" method="post">
        <label for="nome"> Nome: </label>
            <input type="text" name="nome" id="nome" class="form-control" required="required">
	    <label for="cidade"> Cidade: </label>
            <input type="text" name="cidade" id="cidade" class="form-control" required="required">
	    <label for="bairro"> Bairro: </label>
            <input type="text" name="bairro" id="bairro" class="form-control" required="required">
        <label for="instrumentos"> Instrumentos que você toca: </label>
            <input type="text" name="instrumentos" id="instrumentos" class="form-control">
	    <label for="email"> Email: </label>
            <input type="email" name="email" id="email" class="form-control" required="required">
	    <label for="face"> Facebook: </label>
            <input type="email" name="face" id="face" class="form-control" required="required">
	    <label for="objetivo"> Objetivo: </label>
            <input list="objetivo" name="objetivo" required="required">
            <datalist id="objetivo">
                <option value="Tocar Ocasionalmente">
                <option value="Procuro Banda">
                <option value="Procuro musico">
            </datalist>
            <!--
            <div class="radio">
                <label><input value="1" name="objetivo" type="radio" required="required">Tocar Ocasionamente</label>
            </div>
            <div class="radio">
                <label><input value="2" name="objetivo" type="radio">Procuro banda</label>
            </div>
            <div class="radio">
                <label><input value="3" name="objetivo" type="radio">Procuro musico</label>
            </div>
            -->
        <label for="estilo_gosta"> Estilo que você gosta: </label>
            <input type="text" name="estilo_gosta" id="estilo_gosta" class="form-control">
        <label for="estilo_nao_gosta"> Estilo que você não gosta: </label>
            <input type="text" name="estilo_nao_gosta" id="estilo_nao_gosta" class="form-control">
        <label for="codigo">Código do anúncio</label>
            <input type="password" name="codigo" id="codigo" class="form-control">
            <br>
        <input type="submit" class="btn btn-success btn-mini" value="Criar Anúncio">
        </form>
        </div>


        <!-- jQuery -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    </body>
</html>



<ul>
    
</ul>

    
"""))}
    }
    
    def render(anuncios:List[Anuncio]): play.api.templates.HtmlFormat.Appendable = apply(anuncios)
    
    def f:((List[Anuncio]) => play.api.templates.HtmlFormat.Appendable) = (anuncios) => apply(anuncios)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 03 12:10:59 BRT 2015
                    SOURCE: /home/paulo/Documentos/SI1/play-bd-e-testes/app/views/criar.scala.html
                    HASH: 213ecd2f4e06ec9c47f3caf700df424268704b8f
                    MATRIX: 781->1|900->26|1534->624|1549->630|1594->653|1700->723|1715->729|1757->749|1844->800|1859->806|1904->829|2248->1137|2263->1143|2310->1168
                    LINES: 26->1|29->1|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|61->33|61->33|61->33
                    -- GENERATED --
                */
            