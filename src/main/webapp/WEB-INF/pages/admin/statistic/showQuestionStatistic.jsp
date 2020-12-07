<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 24.11.2020
  Time: 1:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>QuestionStatistic</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin/table.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin/general.css" />">
</head>
<body class="myBody">
<div>
    <table class="steelBlueCols">
        <tr>
            <th>Формулировка вопроса</th>
            <th>Пройдено всего</th>
            <th>Процент правильныо пройденных вопросов</th>
        </tr>
        <c:forEach items="${questionStatistic}" var="item">
            <tr>
                <td>${item.description}</td>
                <td>${item.numberOfAnswers}</td>
                <td>${item.percentOfRightAnswers}</td>
            </tr>
        </c:forEach>
    </table>
    <form action="/admin/goBackToShowStatistic">
        <input type="submit" value="Назад" class="myTableButton">
    </form>
</div>
</body>
</html>
