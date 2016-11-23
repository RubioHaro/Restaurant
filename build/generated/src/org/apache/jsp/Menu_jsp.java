package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controladores.ListaOrdenes;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Mike's Grill</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/Estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: none\">\n");
      out.write("        ");

            HttpSession sesion = request.getSession();            
            ListaOrdenes ListaOrdenesDeSesion;
            String Nombre = request.getParameter("Nombre");            
            if (Nombre != null && Nombre != "") {                
                sesion.setAttribute("Index", 1);
                ListaOrdenesDeSesion = new ListaOrdenes(Nombre);
                sesion.setAttribute("Nombre", ListaOrdenesDeSesion);
            } else {
                Integer Index = (Integer) sesion.getAttribute("Index");
                if (Index != null && Index == 1) {
                    ListaOrdenesDeSesion = (ListaOrdenes) sesion.getAttribute("ListaOrdenes");
                } else {
                    response.sendRedirect("http://localhost:8080/Restaurante/Index.jsp/Name.jsp");
                }
            }

            String Pedido = request.getParameter("btn");
            int Entrada1;
            switch (Pedido) {
                case "Caesar Salad":
                case "Maine Lobster Cocktail":
                case "Broiled Sea Scallops":
                case "Porterhouse Steak":
                case "Cajun Ribeye Steak":
                case "Chicago Style Prime Bone-In Ribeye":
                case "Chadon Brut Classic":
                case "MÖET & CHANDON":
                case "CHÂTEAU MOUNTON ROTHSCHILD":
            }
            int Entrada2;
            int Entrada3;
            int Bebida1;
            int Bebida2;
            int Bebida3;
            int Carne1;
            int Carne2;
            int Carne3;
            if (Pedido != null && Pedido != "") {
                out.println("<script>alert('Se a añadido: " + Pedido + "')</script>");
            }


        
      out.write("\n");
      out.write("        <div class=\"container\" style=\"width: 100%;background-image: url('img/fondo.jpg'); background-size: cover;\"> \n");
      out.write("            <img src=\"img/Botones/mike Grills.png\" style=\"width:100vw; height:40vh\" alt=\"fondo\"/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"Turismo\" class=\"container-fluid bgT text-center\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h1>Menu</h1>\n");
      out.write("                    <a class=\"btn-default btn\" href=\"#1\">Entradas</a>\n");
      out.write("                    <a class=\"btn-default btn\" href=\"#2\">Cortes</a>\n");
      out.write("                    <a class=\"btn-default btn\" href=\"#3\">Bebidas</a>\n");
      out.write("                    <!--<a class=\"btn-default btn\" href=\"#4\">Postres</a>-->\n");
      out.write("                    <br/><br/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <form method=\"post\" action='Menu.jsp'>\n");
      out.write("\n");
      out.write("            <div id=\"1\" class=\"container-fluid text-center\">\n");
      out.write("\n");
      out.write("                <h2>Entradas</h2>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/cesatr.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada1\"  />\n");
      out.write("                        <h4>Caesar Salad</h4>\n");
      out.write("                        <p> lechuga romana, trocitos de pan tostado aliñados y queso parmesano. </p>\n");
      out.write("                        <button name=\"btn\" value=\"Caesar Salad\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/entrada2.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada2\"  />\n");
      out.write("                        <h4>Maine Lobster Cocktail</h4>\n");
      out.write("                        <p>Carne de langosta en un mar de martini y salsa especial de mayonesa</p>\n");
      out.write("                        <button name=\"btn\" value=\"Maine Lobster Cocktail\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/entrada3.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada3\"  />\n");
      out.write("                        <h4>Broiled Sea Scallops</h4>\n");
      out.write("                        <p>Pectínidos (Vieiras) asados al limón, con compota de cebolleta y tomate al tomillo y caramelo de su coral.</p>\n");
      out.write("                        <button name=\"btn\" value=\"Broiled Sea Scallops\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"2\" class=\"container-fluid text-center\">\n");
      out.write("\n");
      out.write("                <h2>Cortes</h2>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/carne1.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada1\"  />\n");
      out.write("                        <h4>Porterhouse Steak</h4>\n");
      out.write("                        <p>T-Bone elaborado a la parrilla</p>\n");
      out.write("                        <button name=\"btn\" value=\"Porterhouse Steak\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/carne2.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada2\"  />\n");
      out.write("                        <h4>Cajun Ribeye Steak</h4>\n");
      out.write("                        <p>Barbacoa marinada, reposada por un dia con cebolla y pimientones</p>\n");
      out.write("                        <button name=\"btn\" value=\"Cajun Ribeye Steak\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/carne3.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada3\"  />\n");
      out.write("                        <h4>Chicago Style Prime Bone-In Ribeye</h4>\n");
      out.write("                        <p>Suave y tierno filete estilo Chicago</p>\n");
      out.write("                        <button name=\"btn\" value=\"Chicago Style Prime Bone-In Ribeye\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"3\" class=\"container-fluid text-center\">\n");
      out.write("\n");
      out.write("                <h2>Bebidas</h2>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/Bebida1.jpg\" class=\"imgEstandar-Bebidas center-block\" alt=\"Entrada1\"  />\n");
      out.write("                        <h4>Chadon Brut Classic</h4>\n");
      out.write("                        <p>Vino espumoso, sabor unico con extractos de manzana, la pera y cítricos, sabores y aromas con un toque de especias que lleva a un acabado suave y seco</p>\n");
      out.write("                        <button name=\"btn\" value=\"Chadon Brut Classic\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/Bebida2.jpg\" class=\"imgEstandar-Bebidas center-block\" alt=\"Entrada2\"  />\n");
      out.write("                        <h4>MÖET & CHANDON</h4>\n");
      out.write("                        <p>DOM PÉRIGNON P2 VINTAGE 1998</p>\n");
      out.write("                        <button name=\"btn\" value=\"MÖET & CHANDON\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <img src=\"img/Botones/Bebida3.jpg\" class=\"imgEstandar-Bebidas center-block\" alt=\"Entrada3\"  />\n");
      out.write("                        <h4>CHÂTEAU MOUNTON ROTHSCHILD</h4>\n");
      out.write("                        <p>Tinto color violeta que revela frutas rojas y negras con especias picantes que se mezclan armoniosamente con la vainilla</p>\n");
      out.write("                        <button name=\"btn\" value=\"CHÂTEAU MOUNTON ROTHSCHILD\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <!--<div id=\"4\" class=\"container-fluid text-center\">\n");
      out.write("            <h2>Postres</h2>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img src=\"img/Botones/cesatr.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada1\"  />\n");
      out.write("                    <h4>Caesar Salad</h4>\n");
      out.write("                    <p> lechuga romana, trocitos de pan tostado aliñados y queso parmesano. </p>\n");
      out.write("                    <button name=\"Entrada1\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img src=\"img/Botones/entrada2.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada2\"  />\n");
      out.write("                    <h4>Maine Lobster Cocktail</h4>\n");
      out.write("                    <p>Carne de langosta en un mar de martini y salsa especial de mayonesa</p>\n");
      out.write("                    <button name=\"Entrada1\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img src=\"img/Botones/entrada3.jpg\" class=\"imgEstandar center-block\" alt=\"Entrada3\"  />\n");
      out.write("                    <h4>Broiled Sea Scallops</h4>\n");
      out.write("                    <p>Pectínidos (Vieiras) asados al limón, con compota de cebolleta y tomate al tomillo y caramelo de su coral.</p>\n");
      out.write("                    <button name=\"Entrada1\" class=\"btn btn-default\">Ordenar</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("        <script src=\"js/jquery2.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a href=\"Index.jsp\"><img class=\"img-circle center-block\" style=\"height: 100px; width: 100px;\" alt=\"regresar\" src=\"img/Botones/return.png\" /></a>                    \n");
      out.write("            <br/>            \n");
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
