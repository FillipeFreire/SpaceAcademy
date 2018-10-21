<%-- 
    Document   : perfil
    Created on : 21/10/2018, 12:14:49
    Author     : Fillipe Freire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <title>Perfil</title>
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
                    <a href="perfil.jsp"><img src="imagens/icons/ic_menu_person_white.png" style="width: 60px; height: 65px; "></a>
                </td>
            </tr>
	</table>
        <div class="contentView">
            <h2 class="contentH2">Seu Perfil</h2>
	</div>
	<form method="post" action="alterar_perfil.do" style="color: #000; text-align: center;">
            <img src="imagens/icons/ic_menu_person_white.png" style="background-color: #000; width: 100px; height: 100px; border-radius: 50%; margin-top: 13px;"><br/>
            <table style="margin: auto; font-size: 20px">
                <tr>
                    <td>Login: </td>
                    <td><input type="text" name="login"></td>
                </tr>
                <tr>
                    <td>Senha: </td>
                    <td><input type="text" name="senha"></td>
                </tr>
                <tr>
            </table>
	</form>
    </body>
</html>
