package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class foguetes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Foguetes</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <script type=\"text/javascript\"\n");
      out.write("            src=\"https://maps.googleapis.com/maps/api/js?key=460LSON4A6yD7xvwASDd” >\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function initialize() {\n");
      out.write("              var mapOptions = {\n");
      out.write("                center: new google.maps.LatLng(-34.397, 150.644),\n");
      out.write("                zoom: 8,\n");
      out.write("                mapTypeId: google.maps.MapTypeId.ROADMAP\n");
      out.write("              };\n");
      out.write("              var map = new google.maps.Map(document.getElementById(\"map_canvas\"),\n");
      out.write("                  mapOptions);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body onload=\"initialize()\">\n");
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
      out.write("            <h2 class=\"contentH2\">Foguetes e Estações Perto de Você</h2>\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"map_canvas\" style=\"width:100%; height:100%\">\n");
      out.write("        <img src=\"imagens/maps.jpg\" />\n");
      out.write("        </div>\n");
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
