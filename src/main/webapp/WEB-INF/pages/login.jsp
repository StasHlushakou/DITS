<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>

<body>


<form action="<c:url value="/login"/>" method="post" >
    <c:if test="${param.error != null}">
        <div class="alert alert-danger">
            <p>Неверное имя пользователя или пароль</p>
        </div>
    </c:if>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

    <div id="login">
        <input type="text" name="username" placeholder="Логин" value="" required>
        <br>
        <input type="password" name="password" placeholder="Пароль" value="" required>
        <br>
        <input type="submit" class="submit-button" value="Войти">
    </div>

</form>

</body>
</html>
