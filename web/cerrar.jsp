<%-- 
    Document   : Cerrar Sesion
    Created on : 27/10/2016, 08:01:52 AM
    Author     : Alumno
--%>

<%@page import="Controladores.Orden"%>
<%@page import="Controladores.ListaOrdenes"%>
<%@include file="ValidadorDeSesion.jspf" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/Estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h4>
            Recibo
        </h4>    
        <table class="table table-condensed" style="color: white;background-color: rgba(125,125,125,.5)">
            <thead>
                <tr>
                    <th>Pedido</th>
                    <th>Costo</th>
                    <th>Cantidad</th>
                    <th>Total de la orden</th>
                </tr>
            </thead>
            <tbody>
                <%                    
                    ListaOrdenes Ticket = (ListaOrdenes) sesion.getAttribute("Ticket");
                    int tam = Ticket.GetTam();
                    boolean c = false;
                    for (int i = 0; i < tam; ++i) {

                        Orden OrdenInst = Ticket.get(i);
                        if (OrdenInst.getCantidad() > 0) {
                            out.println("<tr>"
                                    + "<td>" + OrdenInst.getNombre() + "</td>"
                                    + "<td>" + OrdenInst.getCostoxUnidad() + " (c/o)</td>"
                                    + "<td>" + OrdenInst.getCantidad() + "</td>"
                                    + "<td>" + OrdenInst.getCostoTotal() + "</td>"
                                    + "</tr>");
                            c = true;
                        }
                    }
                    if (!c) {
                        out.println("<tr>"
                                + "<td colspan=\"4\">No has pedido nada :/</td>"
                                + "</tr>");

                    }
                %>
            </tbody>
        </table>
        <div class="container">
            <div class="panel">
                <div class="panel-heading">
                    Recibo de: <%  out.println(Ticket.getNombre() + " "); %>
                </div>
                <div class="panel-body">
                    Total a pagar: $<% out.println(Ticket.CalcularTotalAPagar() + " ");%> pesos
                </div>
                <div class="panel-footer">
                    <form method="post" action="Name.jsp">
                        <button class="btn btn-default center-block" type="submit">Pagar</button>
                    </form>
                </div>
            </div>

        </div>
        <script src="js/jquery2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
