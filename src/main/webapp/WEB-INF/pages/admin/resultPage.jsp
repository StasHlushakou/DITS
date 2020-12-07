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
    <title>Result page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin/general.css" />">
</head>
<body class="myBody">
<div>
    <p class="textRow">
        <c:set var="result" scope="page" value="${result}"/>
        <c:out value="${result}"/>
    </p>
</div>

<form action="/admin/goHomeAdmin">
    <input type="submit" value="Вернуться на домашнюю страницу" class="myButton">
</form>

</body>
</html>
