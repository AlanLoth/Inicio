<%-- 
    Document   : index
    Created on : 28/10/2016, 05:18:53 PM
    Author     : Loth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" type="text/css" href="css.css">
    </head>
    <body>
        <div class="inicio">
            <form name="agrega" action="Registro" method="POST">
                Nombre: <input type="text" id="nombre" name="nombre" placeholder="Nombre">
                .     Contraseña: <input type="text" id="contra" name="contra" placeholder="Contraceña">
                .     <input type="submit" value="Registrar">
            </form>
        </div>
        <div class="centered">
            <img src="logo.png" class="ima"/>
        </div>
    </body>
</html>
