<%@page import="fact.it.www.beans.Spel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Speldetails</title>
    </head>
    <body>
        <%Spel spel = (Spel) request.getAttribute("spel");%>
        <h1><%=spel.getNaam()%></h1>
        <p><%=spel.getAuteur()%></p>
        <p>Jaar uitgifte: <%=spel.getJaar_uitgifte()%></p>
        <p>Leeftijd: <%=spel.getLeeftijd()%></p>
        <p>Max aantal spelers: <%=spel.getMax_spelers()%></p>
        <p>Min aantal spelers: <%=spel.getMin_spelers()%></p>
        <p>Speelduur: <%=spel.getSpeelduur()%></p>
       <img src="images/<%=spel.getAfbeelding()%>" alt="<%=spel.getNaam()%>"/>
        <p><a href="index.jsp">Terug naar hoofdpagina</a></p>
    </body>
</html>
