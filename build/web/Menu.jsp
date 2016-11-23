<%-- 
    Document   : Menu
    Created on : 13-nov-2016, 19:39:42
    Author     : Rod
--%>

<%@page import="Controladores.Orden"%>
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
    <body style="background-image: none">
        <%            String Pedido = request.getParameter("btn");
            if (Pedido != null && Pedido != "") {
                ListaOrdenes Ticket = (ListaOrdenes) sesion.getAttribute("Ticket");
                Ticket.AñadirPedido(Pedido);
                out.println("<script>alert('Se a añadido: " + Pedido + "')</script>");
                sesion.setAttribute("Ticket", Ticket);
            }

        %>
        <div class="container" style="width: 100%;background-image: url('img/fondo.jpg'); background-size: cover;"> 
            <img src="img/Botones/mike Grills.png" style="width:100vw; height:40vh" alt="fondo"/>
        </div>
        <div id="Turismo" class="container-fluid bgT text-center">
            <div class="row">
                <div class="col-md-12">
                    <h1>Menu</h1>
                    <a class="btn-default btn" href="#1">Entradas</a>
                    <a class="btn-default btn" href="#2">Cortes</a>
                    <a class="btn-default btn" href="#3">Bebidas</a>
                    <!--<a class="btn-default btn" href="#4">Postres</a>-->
                    <br/><br/>
                </div>

            </div>

        </div>
        <form method="post" action='Menu.jsp'>

            <div id="1" class="container-fluid text-center">

                <h2>Entradas</h2>
                <br>
                <div class="row">
                    <div class="col-sm-4">
                        <img src="img/Botones/cesatr.jpg" class="imgEstandar center-block" alt="Entrada1"  />
                        <h4>Caesar Salad</h4>
                        <p> lechuga romana, trocitos de pan tostado aliñados y queso parmesano. </p>
                        <button name="btn" value="Caesar Salad" class="btn btn-default">Ordenar</button>
                    </div>
                    <div class="col-sm-4">
                        <img src="img/Botones/entrada2.jpg" class="imgEstandar center-block" alt="Entrada2"  />
                        <h4>Maine Lobster Cocktail</h4>
                        <p>Carne de langosta en un mar de martini y salsa especial de mayonesa</p>
                        <button name="btn" value="Maine Lobster Cocktail" class="btn btn-default">Ordenar</button>
                    </div>
                    <div class="col-sm-4">
                        <img src="img/Botones/entrada3.jpg" class="imgEstandar center-block" alt="Entrada3"  />
                        <h4>Broiled Sea Scallops</h4>
                        <p>Pectínidos (Vieiras) asados al limón, con compota de cebolleta y tomate al tomillo y caramelo de su coral.</p>
                        <button name="btn" value="Broiled Sea Scallops" class="btn btn-default">Ordenar</button>
                    </div>

                </div>
            </div>
            <div id="2" class="container-fluid text-center">

                <h2>Cortes</h2>
                <br>
                <div class="row">
                    <div class="col-sm-4">
                        <img src="img/Botones/carne1.jpg" class="imgEstandar center-block" alt="Entrada1"  />
                        <h4>Porterhouse Steak</h4>
                        <p>T-Bone elaborado a la parrilla</p>
                        <button name="btn" value="Porterhouse Steak" class="btn btn-default">Ordenar</button>
                    </div>
                    <div class="col-sm-4">
                        <img src="img/Botones/carne2.jpg" class="imgEstandar center-block" alt="Entrada2"  />
                        <h4>Cajun Ribeye Steak</h4>
                        <p>Barbacoa marinada, reposada por un dia con cebolla y pimientones</p>
                        <button name="btn" value="Cajun Ribeye Steak" class="btn btn-default">Ordenar</button>
                    </div>
                    <div class="col-sm-4">
                        <img src="img/Botones/carne3.jpg" class="imgEstandar center-block" alt="Entrada3"  />
                        <h4>Chicago Style Prime Bone-In Ribeye</h4>
                        <p>Suave y tierno filete estilo Chicago</p>
                        <button name="btn" value="Chicago Style Prime Bone-In Ribeye" class="btn btn-default">Ordenar</button>
                    </div>

                </div>
            </div>
            <div id="3" class="container-fluid text-center">

                <h2>Bebidas</h2>
                <br>
                <div class="row">
                    <div class="col-sm-4">
                        <img src="img/Botones/Bebida1.jpg" class="imgEstandar-Bebidas center-block" alt="Entrada1"  />
                        <h4>Chadon Brut Classic</h4>
                        <p>Vino espumoso, sabor unico con extractos de manzana, la pera y cítricos, sabores y aromas con un toque de especias que lleva a un acabado suave y seco</p>
                        <button name="btn" value="Chadon Brut Classic" class="btn btn-default">Ordenar</button>
                    </div>
                    <div class="col-sm-4">
                        <img src="img/Botones/Bebida2.jpg" class="imgEstandar-Bebidas center-block" alt="Entrada2"  />
                        <h4>MÖET & CHANDON</h4>
                        <p>DOM PÉRIGNON P2 VINTAGE 1998</p>
                        <button name="btn" value="MÖET & CHANDON" class="btn btn-default">Ordenar</button>
                    </div>
                    <div class="col-sm-4">
                        <img src="img/Botones/Bebida3.jpg" class="imgEstandar-Bebidas center-block" alt="Entrada3"  />
                        <h4>CHÂTEAU MOUNTON ROTHSCHILD</h4>
                        <p>Tinto color violeta que revela frutas rojas y negras con especias picantes que se mezclan armoniosamente con la vainilla</p>
                        <button name="btn" value="CHÂTEAU MOUNTON ROTHSCHILD" class="btn btn-default">Ordenar</button>
                    </div>
                </div>
            </div>
        </form>
        <!--<div id="4" class="container-fluid text-center">
            <h2>Postres</h2>
            <br>
            <div class="row">
                <div class="col-sm-4">
                    <img src="img/Botones/cesatr.jpg" class="imgEstandar center-block" alt="Entrada1"  />
                    <h4>Caesar Salad</h4>
                    <p> lechuga romana, trocitos de pan tostado aliñados y queso parmesano. </p>
                    <button name="Entrada1" class="btn btn-default">Ordenar</button>
                </div>
                <div class="col-sm-4">
                    <img src="img/Botones/entrada2.jpg" class="imgEstandar center-block" alt="Entrada2"  />
                    <h4>Maine Lobster Cocktail</h4>
                    <p>Carne de langosta en un mar de martini y salsa especial de mayonesa</p>
                    <button name="Entrada1" class="btn btn-default">Ordenar</button>
                </div>
                <div class="col-sm-4">
                    <img src="img/Botones/entrada3.jpg" class="imgEstandar center-block" alt="Entrada3"  />
                    <h4>Broiled Sea Scallops</h4>
                    <p>Pectínidos (Vieiras) asados al limón, con compota de cebolleta y tomate al tomillo y caramelo de su coral.</p>
                    <button name="Entrada1" class="btn btn-default">Ordenar</button>
                </div>

            </div>
        </div>-->
        <script src="js/jquery2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <div class="container">
            <a href="Index.jsp"><img class="img-circle center-block" style="height: 100px; width: 100px;" alt="regresar" src="img/Botones/return.png" /></a>                    
            <br/>            
        </div>
    </body>
</html>
