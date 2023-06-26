<%-- 
    Document   : afficheImage
    Created on : Jun 20, 2023, 4:19:03 PM
    Author     : Kanto
--%>
<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Image> list = (ArrayList<Image>) request.getAttribute("list");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="${pageContext.request.contextPath}/assets/<%=list.get(0).getSary() %>" >
    </body>
</html>
