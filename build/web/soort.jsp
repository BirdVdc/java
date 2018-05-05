<%@page import="fact.it.www.beans.Soort"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="style.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spellen</title>
    </head>
    <body>
        <%Soort soort = (Soort) request.getAttribute("soort");%>
        <h1><%=soort.getNr()+ " " +soort.getSoortnaam()%></h1>
        
        <p><a href="index.jsp">Terug naar hoofdpagina</a></p>
    </body>
</html>
