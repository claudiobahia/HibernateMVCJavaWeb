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
            <form method="post" action="cursoatualizado">
                <table border ="1" class="table table-striped table-bordered"  style="width: auto">
                    <tr>
                        <th>Curso</th>
                        <th>${aluno.curso_id.nome}</th>
                    </tr>
                    <tr>
                        <th>Novo: </th>
                        <th><input name="curso" id="curso" type="text"</th>
                    </tr>
                </table>
                <input type="submit" hidden="" value="${aluno.aluno_id}" name="aluno_id" id="aluno_id"/>
                <input type="submit"/>
            </form>
            <br>
        </div>
    </body>
</html>
