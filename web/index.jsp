<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Spellen</title>
    </head>
    <body>
        <form action="ManageServlet">
        <h1>Spellen - Sam Rutten</h1>
        <p><input type="submit" value="Toon eerste spelsoort" name="EersteSpelsoort"/></p>
        <p><input type="submit" value="Toon het vijfde spel" name="VijfdeSpel"/></p>
        <p><a href="ManageServlet?gekozenSpel=lener">eerste lener</a></p>
        <p><input type="submit" value="Toon een spel naar keuze" name="SpelNaarKeuzeKnop"/><input id="textvak" type="text" name="SpelNaarKeuze" size="10"/></p>
        <p><input type="submit" value="Overzicht spellen" name="overzichtTonen"/></p>
        <form/>
    </body>
</html>
