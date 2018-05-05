<%@page import="fact.it.www.beans.Spel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="style.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spellen</title>
    </head>
    <body>
        <%Spel spel = (Spel) request.getAttribute("spel");%>
        <h1><%=spel.getNr()+ " " +spel.getNaam()%></h1>
        <p><%=spel.toString()%></p>
        <img src="images/<%=spel.getAfbeelding()%>" alt="<%=spel.getNaam()%>"/>
        <p><a href="index.jsp">Terug naar hoofdpagina</a></p>
        <br/>
        <br/>
        
        
        
    </body>
</html>
