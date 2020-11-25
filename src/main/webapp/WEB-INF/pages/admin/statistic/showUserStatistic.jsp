<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 25.11.2020
  Time: 2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>UserStatistic</title>
</head>
<body>
<div>
    <table border="1">
        <tr>
            <th>Имя пользователя</th>
            <th>Название теста</th>
            <th>Пройдено всего раз</th>
            <th>Процент правильных ответов</th>
        </tr>
        <c:forEach items="${userStatistic}" var="item">
            <tr>
                <td>${item.userName}</td>
                <td>${item.testName}</td>
                <td>${item.numberPassedTimes}</td>
                <td>${item.percentOfRightAnswers}</td>
            </tr>
        </c:forEach>
    </table>
    <form action="/admin/goToShowStatistic">
        <input type="submit" value="Назад">
    </form>
</div>
</body>
</html>
