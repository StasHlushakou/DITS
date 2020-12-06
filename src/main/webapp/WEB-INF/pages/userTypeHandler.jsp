<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/userTupeHandler.css" />">
</head>
<body>


    <c:if test="${roles.contains(\"USER\")}">
        <a href="<c:url value="/user/main" />" role="button">Войти как пользователь</a>
        <br>
    </c:if>

    <c:if test="${roles.contains(\"ADMIN\")}">
        <a href="<c:url value="/admin" />" role="button">Войти как админ</a>
        <br>
    </c:if>

    <c:if test="${roles.contains(\"MENTOR\")}">
        <a href="<c:url value="/mentor" />" role="button">Войти как ментор</a>
    </c:if>



</body>
</html>
