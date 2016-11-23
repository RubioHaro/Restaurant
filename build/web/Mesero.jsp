<%-- 
    Document   : Mesero
    Created on : 13-nov-2016, 19:39:52
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
        <script>
            function MeseroLlamado() {
                alert('Tu mesero esta en camino :3')
            }
        </script>

    </head>
    <body>
        <img src="img/Botones/mike Grills.png" style="width:100vw; height:20vh" alt="fondo"/>
        <div class="container">
            <a href="Index.jsp"><img class="img-circle center-block" style="height: 100px; width: 100px;" alt="regresar" src="img/Botones/return.png" /></a>                    
            <br/>
            <div class="row">
                <div class="col-md-6">
                    <a onclick="MeseroLlamado();"><img class="img-circle center-block" style="height: 60%; width: 70%;" alt="llamar mesero" src="img/Botones/llamar.png" /></a>
                </div>
                <div class="col-md-6">
                    <a href="cerrar.jsp"><img class="img-circle center-block" style="height: 60%; width: 70%;" alt="pagar" src="img/Botones/pay.png" /></a>                    
                </div>
            </div>
        </div>
        <script src="js/jquery2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
