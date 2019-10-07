<%-- 
    Document   : listarprofessor
    Created on : Sep 26, 2019, 8:41:13 AM
    Author     : claud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Professor</title>
    </head>
    <link href="<c:url value="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <body>
        <br>
        <div class="container" align="center">
            <h1>${msg}</h1>
            <table border ="1" class="table table-striped table-bordered"  style="width: auto">
                <tr>
                    <th>Usuario id</th>
                    <th>Professor id</th>
                    <th>Matricula</th>
                    <th>Nome</th>
                    <th>Email</th>
                    <th>Titulação</th>
                    <th>Ações</th>
                </tr>
                <c:forEach items="${professors}" var="professor">
                    <tr>
                        <th>${professor.usuario_id.usuario_id}</th>
                        <th>${professor.professor_id}</th>
                        <th>${professor.usuario_id.matricula}</th>
                        <th>${professor.usuario_id.nome}</th>
                        <th>${professor.usuario_id.email}</th>
                        <th>${professor.titulacao}</th>
                        <th>
                            <a href="updateprofessor?professor_id=${professor.professor_id}&logado=${logado}" >Editar</a>
                            <a href="excluirprofessor?professor_id=${professor.professor_id}&logado=${logado}" >Excluir</a>
                        </th>
                    </tr>
                </c:forEach>
            </table>
            <br>
            <a href="index">Voltar para login</a>
        </div>
    </body>
</html>
