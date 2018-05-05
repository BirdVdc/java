
<%@page import="fact.it.www.beans.Spel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Fout</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>

        <div id="headercontainer">
            <div id="header">
                <h1>Spellen</h1>
            </div>
        </div>
        <div id="content">
            <h1>Er deed zich een fout voor</h1>  

            <p><%=request.getAttribute("foutboodschap")%></p>

            <p>  <a href="index.jsp">Terug naar beginpagina</a></p>
        </div>
    </body>
</html>
