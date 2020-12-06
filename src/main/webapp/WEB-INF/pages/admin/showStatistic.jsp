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
</head>
<body>

<br> <a href="<c:url value="/admin/statistic/showTestStatistic"/>">Статистика по тесту</a><br>
<br> <a href="<c:url value="/admin/statistic/showQuestionStatistic"/>">Статистика по вопросам</a><br>
<br> <a href="<c:url value="/admin/statistic/showUserStatistic"/>">Статистика пользователей</a><br>

<form action="/admin/goHomeAdmin">
    <input type="submit" value="Назад">
</form>

</body>
</html>
