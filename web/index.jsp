<%-- 
    Document   : index
    Created on : 05-nov-2018, 14:41:00
    Author     : Jorgi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;
              charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h1>Albumes. Obtiene todos los Albumes con EJB </h1>
        <form action="Servlets" method="POST">Presiona el
            botón para obtener los datos.
            <input type="submit" name="enviar" value="Enviar"/></form>

        <form action="UpdateServlet" method="POST">Introduce los datos.

            Titulo: <input type = "text" name = "titulo">
            <br />
            Fecha: <input type = "text" name = "fecha" />
            <br />
            Presupuesto: <input type = "text" name = "presupuesto" />
            <input type="submit" name="enviar" value="Insertar"/></form>
        <form action="SelectServlet" method="POST">Introduce el titulo.

            Titulo: <input type = "text" name = "titulo">
            <br />
            <input type="submit" name="enviar" value="Buscar"/></form>
        <form action="RadioButtonServlet" method="POST">
           
            <input type="submit" name="enviar" value="Borrar"/></form>
    </body>
</html>
