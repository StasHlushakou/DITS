<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 24.11.2020
  Time: 4:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>TestStatistic</title>
</head>
<body>
<div>
    <table border="1">
        <tr>
            <th>Название теста</th>
            <th>Пройдено всего</th>
            <th>Процент правильныо пройденных вопросов</th>
        </tr>
        <c:forEach items="${testStatistic}" var="item">
            <tr>
                <td>${item.name}</td>
                <td>${item.numberPassedTimes}</td>
                <td>${item.percentOfRightAnswers}</td>
            </tr>
        </c:forEach>
    </table>
    <form action="/admin/goBackToShowStatistic">
        <input type="submit" value="Назад">
    </form>
</div>
</body>
</html>
