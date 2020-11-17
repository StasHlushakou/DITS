<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Spring Security</title>
</head>

<body>

<div class="container">

    <div class="jumbotron" style="margin-top: 20px;">
        <h1>DITS</h1>
        <p class="lead">Velcome to DITS.</p>
        <sec:authorize access="!isAuthenticated()">
            <p><a class="btn btn-lg btn-success" href="<c:url value="/login" />" role="button">Sign in</a></p>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <p>Your login: <sec:authentication property="principal.username" /></p>
            <p><a class="btn btn-lg btn-danger" href="<c:url value="/logout" />" role="button">Sign out</a></p>

        </sec:authorize>
    </div>


</div>
</body>
</html>
