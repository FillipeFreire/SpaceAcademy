<%-- 
    Document   : pesquisa
    Created on : 21/10/2018, 11:59:22
    Author     : Fillipe Freire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <title>SpaceAcademy</title>
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
	<div class="contentView">
            <h2 class="contentH2">Aquele que procura, acha</h2>
	</div>
        <form method="GET" action="pesquisa.do">
            <p>Procure por todos os dados e não desista</p><br>
            <input style="font-size: 20px" type="text" name="pesquisa" placeholder="pesquise aqui">
            <input style="font-size: 20px" type="submit" value="Procurar">
        </form>
    </body>
</html>
