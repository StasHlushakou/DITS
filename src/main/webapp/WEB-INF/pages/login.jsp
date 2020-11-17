<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login page</title>
</head>

<body>

<div>
    <div>
        <c:url var="loginUrl" value="/login"/>
        <form action="${loginUrl}" method="post">
            <c:if test="${param.error != null}">
                <div class="alert alert-danger">
                    <p>Invalid username and password</p>
                </div>
            </c:if>
            <c:if test="${param.logout != null}">
            <div class="alert alert-success">
                <p>You have been logged out succecessfully</p>
            </div>
            </c:if>
            <div>
                <input type="text" class="login-field" id="username" name="username" placeholder="Login" value="" required>
            </div>
            <div>
                <input type="password" class="password-field" id="password" name="password" placeholder="Password" value="" required>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            <input type="submit" class="submit-button" value="Sign in">
        </form>
    </div>
</div>

</body>
</html>
