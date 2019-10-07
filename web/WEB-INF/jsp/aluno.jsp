<%-- 
    Document   : aluno
    Created on : Sep 25, 2019, 7:40:24 PM
    Author     : claud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aluno</title>
    </head>
    <link href="<c:url value="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css"/>" rel="stylesheet"/>

    <body>
        <br>
        <div class="container" align="center">
            <h1>${message}</h1>
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
                    <th>Data de Nascimento</th>
                    <th>${aluno.datanasc}</th>
                </tr>
                <tr>
                    <th>Curso</th>
                    <th>${aluno.curso_id.nome}</th>
                </tr>
            </table>
            <br>
            <a href="changecurso?aluno_id=${aluno.aluno_id}&logado=true">Alterar curso</a>
            <br>
            <a href="index">Voltar para login</a>
        </div>
    </body>
</html>
