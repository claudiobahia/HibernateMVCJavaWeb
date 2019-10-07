<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AT</title>
    </head>
    <link href="<c:url value="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css"/>" rel="stylesheet"/>
    <body>
        <br>
        <div class="container" align="center">
            <form action="logar" method="get">
                ${msg}
                <table border ="1" class="table table-striped table-bordered"  style="width: auto">
                    <tr>
                        <th>Login</th>
                        <th><input type="text" name="email" id="email"/></th>
                    </tr>
                    <tr>
                        <th>Senha</th>
                        <th><input type="password" name="senha" id="senha"/></th>
                    </tr>
                </table>
                <input type="submit"/>
            </form>
            <br>
            <a href="cadastro">Cadastre-se</a>
        </div>
    </body>
</html>
