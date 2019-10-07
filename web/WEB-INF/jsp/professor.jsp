<%-- 
    Document   : professor
    Created on : Sep 25, 2019, 7:40:35 PM
    Author     : claud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Professor</title>
    </head>
    <link href="<c:url value="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css"/>" rel="stylesheet"/>

    <body>
        <br>
        <div class="container" align="center">
            <h1>${msg}</h1>
            <table border ="1" class="table table-striped table-bordered"  style="width: auto">
                <tr>
                    <th>Usuario id</th>
                    <th>${usuario.usuario_id}</th>
                </tr>
                <tr>
                    <th>Matricula</th>
                    <th>${usuario.matricula}</th>
                </tr>
                <tr>
                    <th>Nome</th>
                    <th>${usuario.nome}</th>
                </tr>
                <tr>
                    <th>Email</th>
                    <th>${usuario.email}</th>
                </tr>
                <tr>
                    <th>Senha</th>
                    <th>${usuario.senha}</th>
                </tr>
                <tr>
                    <th>Titulação</th>
                    <th>${professor.titulacao}</th>
                </tr>
            </table>
            <br>
            <a href="index">Voltar para login</a>
            <br><br>
            <a href="listarprofessor?logado=${logado}">Listar professores</a>
        </div>
    </body>
</html>
