<%-- 
    Document   : upload
    Created on : Jun 20, 2023, 1:45:45 PM
    Author     : Kanto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Actu/sary" method="post" enctype="multipart/form-data">
            <input type="file" name="file" multiple="multiple" />
            <input type="submit" value="Upload" />
        </form>
    </body>
</html>
