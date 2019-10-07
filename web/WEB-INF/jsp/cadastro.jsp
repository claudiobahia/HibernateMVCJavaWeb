<%-- 
    Document   : cadastro
    Created on : Sep 24, 2019, 7:54:53 AM
    Author     : claud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <link href="<c:url value="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <body>
        <div class="container" align="center">
            <div align="left">
                <h1>Cadastre-se</h1>
                <form method="post" action="cadastroEfetuado">
                    <table border ="1" class="table table-striped table-bordered"  style="width: auto">
                        <tr>
                            <th>Matricula</th>
                            <th><input type="number" name="matricula" id="matricula" required=""/></th>
                        </tr>
                        <tr>
                            <th>Nome</th>
                            <th><input type="text" name="nome" id="nome" required=""/></th>
                        </tr>
                        <tr>
                            <th>Email</th>
                            <th><input type="email" name="email" id="email" required=""/></th>
                        </tr>
                        <tr>
                            <th>Senha</th>
                            <th><input type="password" name="senha" id="senha" required=""/></th>
                        </tr>
                        <tr>
                            <th>Perfil</th>
                            <th><select name="perfil_id" id="perfil_id" required="">
                                    <option value="Aluno">Aluno</option>
                                    <option value="Professor">Professor</option>
                                </select>
                            </th>
                        </tr>
                        <tr>
                            <th>Data de nascimento</th>
                            <th><input type="date" name="datanasc" id="datanasc" required=""/></th>
                        </tr>
                        <tr>
                            <th>Titulação</th>
                            <th><input type="text" name="titulacao" value="'Terceiro ano'" id="titulacao" required=""/></th>
                        </tr>
                    </table>
                    <input type="submit" id="submit" value="Cadastrar"/>
                </form>
                <a href="index">Voltar para login</a>
            </div>
        </div>
    </body>
</html>
