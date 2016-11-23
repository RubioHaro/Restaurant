<%-- 
    Document   : Name
    Created on : 13-nov-2016, 23:18:51
    Author     : Rod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession sesion = request.getSession();
            sesion.invalidate();
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mike's Grill</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/Estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style="background-image: none">        
        <div class="container" style="width:100vw; height:100vh;background-image: url('img/fondo.jpg'); background-size: cover;"> 
            <img src="img/Botones/mike Grills.png" class="img-responsive" alt="fondo"/>
            <div class="form-group">
                <form action="Iniciar.jsp">
                    <input type="text" name="Nombre" class="form-control" style="font-size: 20px;" placeholder="Ingresa tu nombre" />
                    <button class="btn btn-default center-block" name="Nombre" type="submit">Iniciar</button>
                </form>
            </div>
        </div>

        <script src="js/jquery2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
