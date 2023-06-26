<%-- 
    Document   : resultat
    Created on : Jun 21, 2023, 12:43:44 AM
    Author     : Kanto
--%>
<%double devis = (Double) request.getAttribute("sommeDevis");
double benefice = (Double) request.getAttribute("benefice");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Votre devis est : <%= devis%></h1>
        <h1>Votre benefice par rapport au lieu  est : <%= benefice%></h1>
    </body>
</html>
