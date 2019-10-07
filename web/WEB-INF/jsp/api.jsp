<%-- 
    Document   : api
    Created on : Oct 3, 2019, 8:19:39 AM
    Author     : claud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>API</title>
    </head>
        <link href="<c:url value="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <body>
        <c:forEach items="${usuarios}" var="usuario">
            <br>
        {"usuario": {<br>
            "usuario_id": "${usuario.usuario_id}",<br>
            "nome": "${usuario.nome}",<br>
            "email": "${usuario.email}",<br>
            "senha": "${usuario.senha}",<br>
            "matricula": "${usuario.matricula}",<br>
            }}<br>  
        </c:forEach>

    </body>
</html>
