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
        <table>
             <tr>
                <th>Naam</th>
                <th>Uitgever</th>
                <th>Prijs</th>
            </tr>
            
            <% for(Spel spel : spellen) {%>
           
            <tr>
                <td><a href="ManageServlet?naam=<%=spel.getNaam()%>"><%=spel.getNaam()%></a></td>
                <td><%=spel.getUitgever()%></td>
                <td><%=spel.getPrijs()%></td>
                
            </tr>
            <%}%>
        </table>
        <p><a href="index.jsp">Terug naar hoofdpagina</a></p>
    </body>
</html>