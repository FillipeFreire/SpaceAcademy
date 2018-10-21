package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categorias_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Categoria</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t<table class=\"contentMain\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <h2><a href=\"index.jsp\"><span>Home</span></a></h2>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <h2><a href=\"categorias.jsp\"><span>Categorias</span></a></h2>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <h2><a href=\"foguetes.jsp\"><span>Foguetes</span></a></h2>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <h2><a href=\"missoes.jsp\"><span>Missões</span></a></h2>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <h2><a href=\"pesquisa.jsp\"><span>Pesquisa</span></a></h2>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"User.jsp\"><img src=\"imagens/icons/ic_menu_person_white.png\" style=\"width: 60px; height: 65px; \"></a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("\t</table>\n");
      out.write("\t<div class=\"contentShow\">\n");
      out.write("            <img src=\"imagens/logo/SpaceAcademy.png\">\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"contentView\">\n");
      out.write("            <h2 class=\"contentH2\">Filtros</h2>\n");
      out.write("\t</div>\n");
      out.write("        <div class=\"main_slide_comics_first\" style=\"padding-bottom: 10px\">\n");
      out.write("            <input class=\"filter_radio_input\" type=\"radio\" name=\"category\" value=\"Todos\">\n");
      out.write("            <label class=\"filter_button_online\" onclick=\"filterAll()\" id=\"todos\">\n");
      out.write("                <span class=\"screen-reader-text\">filtrar por</span>\n");
      out.write("                Todos\n");
      out.write("            </label>\n");
      out.write("            <input class=\"filter_radio_input\" type=\"radio\" name=\"category\" value=\"Agencias\">\n");
      out.write("            <label class=\"filter_button\" onclick=\"filterHQ()\" id=\"Age\">\n");
      out.write("                <span class=\"screen-reader-text\">filtrar por</span>\n");
      out.write("                Agências\n");
      out.write("            </label>\n");
      out.write("            <input class=\"filter_radio_input\" type=\"radio\" name=\"category\" value=\"Locais\">\n");
      out.write("            <label class=\"filter_button\" onclick=\"filterFilmes()\" id=\"locais\">\n");
      out.write("                <span class=\"screen-reader-text\">filtrar por</span>\n");
      out.write("                Locais\n");
      out.write("            </label>\n");
      out.write("            <input class=\"filter_radio_input\" type=\"radio\" name=\"category\" value=\"Transmissoes\">\n");
      out.write("            <label class=\"filter_button\" onclick=\"filterFilmes()\" id=\"trnas\">\n");
      out.write("                <span class=\"screen-reader-text\">filtrar por</span>\n");
      out.write("                Transmissões\n");
      out.write("            </label>\n");
      out.write("            <input class=\"filter_radio_input\" type=\"radio\" name=\"category\" value=\"Outros\">\n");
      out.write("            <label class=\"filter_button\" onclick=\"filterOutros()\" id=\"O\">\n");
      out.write("                <span class=\"screen-reader-text\">filtrar por</span>\n");
      out.write("                Outros\n");
      out.write("            </label>\n");
      out.write("        </div>\n");
      out.write("\t");

            int cont;
            cont = 0;
            while (cont < 10) {
                    cont++;
	
      out.write("\n");
      out.write("\t<table class=\"contentTable\">\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\"><a>Foguete: <a style=\"font-weight: normal;\">Falcon 9 v1.1 | SpX CRS-5</a></a></h2></td>\n");
      out.write("                <td style=\"color: #00ff00\"><a href=\"\" style=\"color: #00ff00 !important\">Ao Vivo</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("\t\t<td><h2 style=\"margin: auto;\">Missão: <a style=\"font-weight: normal;\">GPS IIF-10</a></h2></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Agência: <a style=\"font-weight: normal;\">Starsem SA</a></h2></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Lançamento marcado para ás 9h47min</h2></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Data: <a style=\"font-weight: normal;\">January 10, 2015 09:47:10 UTC</a></h2></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Local: <a style=\"font-weight: normal;\">Jiuquan, People's Republic of China</a></h2></td>\n");
      out.write("                <td><form method=\"post\" action=\"fogueteDetals.php?id=1\"><input class=\"inputTop\" type=\"submit\" value=\"Detalhes\"></form></td>\n");
      out.write("            </tr>\n");
      out.write("\t</table>\n");
      out.write("\t<h2 style=\"color: #000\">_____________________________________________________________________________</h2>\n");
      out.write("\t<table class=\"contentTable\">\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\"><a>Foguete: <a style=\"font-weight: normal;\">Soyuz-FG | Soyuz TMA-17M</a></a></h2></td>\n");
      out.write("                <td style=\"color: red\">Ao Vivo</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Missão: <a style=\"font-weight: normal;\">Shenzhou-10</a></h2></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Agência: <a style=\"font-weight: normal;\">National Authority for Remote Sensing and Space Sciences</a></h2></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Janela de Lançamento: 16:28 am</h2></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Data: <a style=\"font-weight: normal;\">July 10, 2015 16:28:00 UTC</a></h2></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><h2 style=\"margin: auto;\">Local: <a style=\"font-weight: normal;\">Kauai, USA</a></h2></td>\n");
      out.write("                <td><form method=\"post\" action=\"fogueteDetals.php?id=1\"><input class=\"inputTop\" type=\"submit\" value=\"Detalhes\"></form></td>\n");
      out.write("            </tr>\n");
      out.write("\t</table>\n");
      out.write("\t<h2 style=\"color: #000\">_____________________________________________________________________________</h2>\n");
      out.write("\t");
 } 
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
