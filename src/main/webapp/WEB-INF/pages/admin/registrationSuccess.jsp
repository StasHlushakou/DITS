<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 22.11.2020
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration success page</title>
</head>
<body>
<div>
    <c:set var="result" scope="page" value="${success}"/>
    <c:out value="${result}" />
</div>

<span>
    <a href="<c:url value='/admin/goHomeAdmin' />">Вернуться на домашнюю страницу</a>
</span>
</body>
</html>
