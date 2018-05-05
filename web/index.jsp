<%-- 
    Document   : index
    Created on : Apr 16, 2018, 9:23:23 AM
    Author     : Maarten
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spellen</title>
    </head>
    <body>
        <form action="ManageServlet">
        <h1>Spellen - Sam Rutten</h1>
        <p><input type="submit" value="Toon eerste spelsoort" name="tooneerstespelsoort"/></p>
        <p><input type="submit" value="Toon het vijfde spel" name="toonhetvijfdespel"/></p>
        <p><a href="ManageServlet?gekozen=lener">eerste lener</a></p>
        <p><input type="text" name="spelnaarkeuze" size="5"/><input type="submit" value="Toon een spel naar keuze" name="tooneenspelnaarkeuze"/></p>
        <form/>
    </body>
</html>
