<%-- 
    Document   : newjsp
    Created on : 14-nov-2016, 0:09:45
    Author     : Rod
--%>

<%@page import="Controladores.ListaOrdenes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wait</title>
    </head>
    <body>
        <%            
            HttpSession sesion = request.getSession();
            String Nombre = request.getParameter("Nombre");
            
            if (Nombre != null && Nombre != "") {
                sesion.setAttribute("Nombre", Nombre);
                sesion.setAttribute("Ticket",new ListaOrdenes(Nombre));
                response.sendRedirect("http://localhost:8080/Restaurante/Index.jsp/Index.jsp");
            } else {
                response.sendRedirect("http://localhost:8080/Restaurante/Index.jsp/Name.jsp");
            }
        %>
        <h1>Cargando...</h1>
    </body>
</html>
