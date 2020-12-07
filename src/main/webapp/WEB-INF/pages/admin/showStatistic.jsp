<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 15.11.2020
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Статистика</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin/general.css" />">
</head>
<body class="myBody">

<br> <a class="myLink" href="<c:url value="/admin/statistic/showTestStatistic"/>">Статистика по тесту</a><br>
<br> <a class="myLink" href="<c:url value="/admin/statistic/showQuestionStatistic"/>">Статистика по вопросам</a><br>
<br> <a class="myLink" href="<c:url value="/admin/statistic/showUserStatistic"/>">Статистика пользователей</a><br>

<form action="/admin/goHomeAdmin">
    <input type="submit" value="Назад" class="myButton">
</form>

</body>
</html>
