<%-- 
    Document   : soort
    Created on : Apr 16, 2018, 9:26:14 AM
    Author     : Maarten
--%>
<%@page import="fact.it.www.beans.Soort"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
