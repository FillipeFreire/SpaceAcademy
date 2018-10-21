package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orgaos_005forganizadores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Orgãos Organizadores</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"contentMain\">\n");
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
      out.write("                    <h2><a href=\"orgaos_financiadores.jsp\"><span>Orgãos Financiadores</span></a></h2>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <h2><a href=\"pesquisa.jsp\"><span>Pesquisa</span></a></h2>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"User.jsp\"><img src=\"imagens/icons/ic_menu_person_white.png\" style=\"width: 60px; height: 65px; \"></a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("\t</table>\n");
      out.write("\t<div class=\"contentView\">\n");
      out.write("            <h2 class=\"contentH2\">Apoiadores</h2>\n");
      out.write("\t</div>\n");
      out.write("        <div style=\"background-color: #000000b8\">\n");
      out.write("            <h2>Pesquisas Espaciais</h2>\n");
      out.write("            \n");
      out.write("            <h2>Principais Orgãos Financiadores</h2>\n");
      out.write("\n");
      out.write("            <h3>Nacionais</h3>\n");
      out.write("\n");
      out.write("            <a href=\"http://www.inpe.br/institucional/sobre_inpe/relacoes_internacionais/\">INPE (Instituto Nacional de Pesquisas Especiais)</a><br>\n");
      out.write("\n");
      out.write("            <a href=\"http://www.aeb.gov.br/\">AEB - Agência Espacial Brasileira</a><br>\n");
      out.write("\n");
      out.write("            <a href=\"http://lnapadrao.lna.br/\">LNA (Laboratório Nacional de Astrofísica)</a><br>\n");
      out.write("\n");
      out.write("            <a href=\"http://www.on.br/index.php/pt-br/\">ON (Observatório Nacional)</a><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h3>Internacionais</h3>\n");
      out.write("\n");
      out.write("            <a href=\"http://www.imprs-cms.mpg.de/7614/03_Application\">IMPRS (International Max Planck Research School For Condensed Matter Science)</a><br>\n");
      out.write("\n");
      out.write("            <a href=\"http://www.fz-juelich.de/portal/EN/Home/home_node.html;jsessionid=FE5E7FC1ABDDE8E7C238A7032C137CD2\">Forschungszentrum Juelich</a><br>\n");
      out.write("\n");
      out.write("            <a href=\"https://www.portal.uni-koeln.de/index.php?id=9441&L=1\">Universidade de Colônbia</a><br>\n");
      out.write("\n");
      out.write("            <a href=\"https://www.tu-chemnitz.de/international/index.php.en\">Universidade de Tecnologia de Chemnitz</a><br>\n");
      out.write("        </div>\n");
      out.write("        <footer id=\"main-footer\" class=\"main_footer\" data-turbolinks-permanent>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"site_map\">\n");
      out.write("                    <div class=\"site_map_section site_map_section_about\">\n");
      out.write("                        <h3 class=\"site_map_section_title\">Sobre</h3>\n");
      out.write("                        <a href=\"\" target=\"_blank\" onclick=\"\">Quem Somos</a>\n");
      out.write("                        <a href=\"\" target=\"_blank\" onclick=\"\">Fale com a gente</a>\n");
      out.write("                        <a href=\"\" target=\"_blank\" onclick=\"\">Contribua</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
