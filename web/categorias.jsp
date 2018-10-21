<%-- 
    Document   : categoria
    Created on : 21/10/2018, 02:58:10
    Author     : Fillipe Freire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categoria</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
	<table class="contentMain">
            <tr>
                <td>
                    <h2><a href="index.jsp"><span>Home</span></a></h2>
                </td>
                <td>
                    <h2><a href="categorias.jsp"><span>Categorias</span></a></h2>
                </td>
                <td>
                    <h2><a href="foguetes.jsp"><span>Foguetes</span></a></h2>
                </td>
                <td>
                    <h2><a href="orgaos_financiadores.jsp"><span>Orgãos Financiadores</span></a></h2>
                </td>
                <td>
                    <h2><a href="pesquisa.jsp"><span>Pesquisa</span></a></h2>
                </td>
                <td>
                    <a href="User.jsp"><img src="imagens/icons/ic_menu_person_white.png" style="width: 60px; height: 65px; "></a>
                </td>
            </tr>
	</table>
	<div class="contentShow">
            <img src="imagens/logo/SpaceAcademy.png">
	</div>
	<div class="contentView">
            <h2 class="contentH2">Filtros</h2>
	</div>
        <div class="main_slide_comics_first" style="padding-bottom: 10px">
            <input class="filter_radio_input" type="radio" name="category" value="Todos">
            <label class="filter_button_online" onclick="filterAll()" id="todos">
                <span class="screen-reader-text">filtrar por</span>
                Todos
            </label>
            <input class="filter_radio_input" type="radio" name="category" value="Agencias">
            <label class="filter_button" onclick="filterHQ()" id="Age">
                <span class="screen-reader-text">filtrar por</span>
                Agências
            </label>
            <input class="filter_radio_input" type="radio" name="category" value="Locais">
            <label class="filter_button" onclick="filterFilmes()" id="locais">
                <span class="screen-reader-text">filtrar por</span>
                Locais
            </label>
            <input class="filter_radio_input" type="radio" name="category" value="Transmissoes">
            <label class="filter_button" onclick="filterFilmes()" id="trans">
                <span class="screen-reader-text">filtrar por</span>
                Transmissões
            </label>
            <input class="filter_radio_input" type="radio" name="category" value="custo">
            <label class="filter_button" onclick="filterFilmes()" id="custo">
                <span class="screen-reader-text">filtrar por</span>
                Custo
            </label>
            <input class="filter_radio_input" type="radio" name="category" value="Outros">
            <label class="filter_button" onclick="filterOutros()" id="O">
                <span class="screen-reader-text">filtrar por</span>
                Outros
            </label>
        </div>
        <div id="All" style="display: block;"><%  %></div>
        <div id="HQ-Livros" style="display: none;"><?php include 'Paginas/filter_hq_livro.php'; ?></div>
        <div id="Filmes" style="display: none;"><?php include 'Paginas/filter_filmes.php'; ?></div>
        <div id="Series" style="display: none;"><?php include 'Paginas/filter_series.php'; ?></div>
        <div id="Tech" style="display: none;"><?php include 'Paginas/filter_tech.php'; ?></div>
        <div id="Outros" style="display: none;"><?php include 'Paginas/filter_outros.php'; ?></div>
	<%
            int cont;
            cont = 0;
            while (cont < 5) {
                    cont++;
	%>
	<table class="contentTable">
            <tr>
                <td><h2 style="margin: auto;"><a>Foguete: <a style="font-weight: normal;">Falcon 9 v1.1 | SpX CRS-5</a></a></h2></td>
                <td style="color: #00ff00"><a href="" style="color: #00ff00 !important">Ao Vivo</a></td>
            </tr>
            <tr>
		<td><h2 style="margin: auto;">Missão: <a style="font-weight: normal;">GPS IIF-10</a></h2></td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Agência: <a style="font-weight: normal;">Starsem SA</a></h2></td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Lançamento marcado para ás 9h47min</h2></td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Data: <a style="font-weight: normal;">January 10, 2015 09:47:10 UTC</a></h2></td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Local: <a style="font-weight: normal;">Jiuquan, People's Republic of China</a></h2></td>
                <td><form method="post" action="fogueteDetals.php?id=1"><input class="inputTop" type="submit" value="Detalhes"></form></td>
            </tr>
	</table>
	<h2 style="color: #000">_____________________________________________________________________________</h2>
	<table class="contentTable">
            <tr>
                <td><h2 style="margin: auto;"><a>Foguete: <a style="font-weight: normal;">Soyuz-FG | Soyuz TMA-17M</a></a></h2></td>
                <td style="color: red">Ao Vivo</td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Missão: <a style="font-weight: normal;">Shenzhou-10</a></h2></td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Agência: <a style="font-weight: normal;">National Authority for Remote Sensing and Space Sciences</a></h2></td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Janela de Lançamento: 16:28 am</h2></td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Data: <a style="font-weight: normal;">July 10, 2015 16:28:00 UTC</a></h2></td>
            </tr>
            <tr>
                <td><h2 style="margin: auto;">Local: <a style="font-weight: normal;">Kauai, USA</a></h2></td>
                <td><form method="post" action="fogueteDetals.php?id=1"><input class="inputTop" type="submit" value="Detalhes"></form></td>
            </tr>
	</table>
	<h2 style="color: #000">_____________________________________________________________________________</h2>
	<% } %>
        <footer id="main-footer" class="main_footer" data-turbolinks-permanent>
            <div class="container">
                <div class="site_map">
                    <div class="site_map_section site_map_section_about">
                        <h3 class="site_map_section_title">Sobre</h3>
                        <a href="" target="_blank" onclick="">Quem Somos</a>
                        <a href="" target="_blank" onclick="">Fale com a gente</a>
                        <a href="" target="_blank" onclick="">Contribua</a>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
