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
        <%Lener lener = (Lener) request.getAttribute("lener");%>
        <h1><%=lener.getLenernaam()+ " " +lener.getGemeente()%></h1>
        <p><a href="index.jsp">Terug naar hoofdpagina</a></p>
    </body>
</html>
