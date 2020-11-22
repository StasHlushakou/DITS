<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


    <c:if test="${roles.contains(\"USER\")}">
        <p><a class="btn btn-lg btn-success" href="<c:url value="/user/main" />" role="button">Sign in how user</a></p>
    </c:if>

    <c:if test="${roles.contains(\"ADMIN\")}">
        <p><a class="btn btn-lg btn-success" href="<c:url value="/admin" />" role="button">Sign in how admin</a></p>
    </c:if>

    <c:if test="${roles.contains(\"MENTOR\")}">
        <p><a class="btn btn-lg btn-success" href="<c:url value="/mentor" />" role="button">Sign in how mentor</a></p>
    </c:if>



</body>
</html>
