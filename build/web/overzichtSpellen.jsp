<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Spel"%>
<%@page import="fact.it.www.beans.Lener"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Spellen</title>
    </head>
    <body>
        <h1>overzicht spellen</h1>
        <%ArrayList<Spel> spellen = (ArrayList<Spel>) request.getAttribute("spellen");%>
        <ul>
            <% for(Spel spel : spellen) {%>
            <li>
                <p><%=spel.getNaam() + "    " + spel.getUitgever()%></p>
            </li>
            <%}%>
        </ul>
        <p><a href="index.jsp">Terug naar hoofdpagina</a></p>
    </body>
</html>