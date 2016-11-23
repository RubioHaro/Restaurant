<%-- 
    Document   : Index
    Created on : 13-nov-2016, 17:51:44
    Author     : Rod
--%>

<%@page import="Controladores.ListaOrdenes"%>
<%@include file="ValidadorDeSesion.jspf" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mike's Grill</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/Estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <img src="img/Botones/mike Grills.png" style="width:100vw; height:20vh" alt="fondo"/>
        <div class="container">
            <br/>
            <br/>
            <div class="row">
                <div class="col-md-6">
                    <a href="Menu.jsp"><img class="img-circle center-block" style="height: 60%; width: 70%;" alt="MENU" src="img/Botones/menu.png" /></a>
                </div>
                <div class="col-md-6">
                    <a href="Mesero.jsp"><img class="img-circle center-block" style="height: 60%; width: 70%;" alt="MENU" src="img/Botones/mesero.png" /></a>                    
                </div>
            </div>
        </div>

        <script src="js/jquery2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>

</html>
