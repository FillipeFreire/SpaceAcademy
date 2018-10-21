<%-- 
    Document   : foguetes
    Created on : 21/10/2018, 08:13:15
    Author     : Fillipe Freire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Foguetes</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript"
            src="https://maps.googleapis.com/maps/api/js?key=460LSON4A6yD7xvwASDd” >
        </script>
        <script type="text/javascript">
            function initialize() {
              var mapOptions = {
                center: new google.maps.LatLng(-34.397, 150.644),
                zoom: 8,
                mapTypeId: google.maps.MapTypeId.ROADMAP
              };
              var map = new google.maps.Map(document.getElementById("map_canvas"),
                  mapOptions);
            }
        </script>
    </head>
    
    <body onload="initialize()">
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
            <h2 class="contentH2">Foguetes e Estações Perto de Você</h2>
	</div>
        <div id="map_canvas" style="width:100%; height:100%">
        <img src="imagens/maps.jpg" />
        </div>
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
