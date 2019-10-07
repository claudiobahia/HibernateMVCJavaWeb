<%-- 
    Document   : update
    Created on : Sep 26, 2019, 8:21:24 AM
    Author     : claud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Professor</title>
    </head>
    <link href="<c:url value="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <body>
        <br>
        <div class="container" align="center">
            <h1>${msg}</h1>
            <form method="post" action="atualizar">
                <input name="professor_id" id="professor_id" value="${professor.professor_id}" hidden=""/>
                <table border ="1" class="table table-striped table-bordered"  style="width: auto">
                    <tr>
                        <th>Matricula</th>
                        <th>${professor.usuario_id.matricula}</th>
                        <th><input type="number" name="matricula" id="matricula" required=""/></th>
                    </tr>
                    <tr>
                        <th>Nome</th>
                        <th>${professor.usuario_id.nome}</th>
                        <th><input type="text" name="nome" id="nome" required=""/></th>
                    </tr>
                    <tr>
                        <th>Email</th>
                        <th>${professor.usuario_id.email}</th>
                        <th><input type="email" name="email" id="email" required=""/></th>
                    </tr>
                    <tr>
                        <th>Senha</th>
                        <th>${professor.usuario_id.senha}</th>
                        <th><input type="password" name="senha" id="senha" required=""/></th>
                    </tr>
                    <tr>
                        <th>Titulação</th>
                        <th>${professor.titulacao}</th>
                        <th><input type="text" name="titulacao" id="titulacao" required=""/></th>
                    </tr>
                </table>
                <input type="submit" value="Atualizar"/>
            </form>
            <br>
            <a href="index">Voltar para login</a>
        </div>
    </body>
</html>
