<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Personal statistic</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/personalStatistic.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/general.css" />">
</head>
<body>


<table>

    <tr>
        <td>
            Ф.И.О.
        </td>
        <td>
            Название теста
        </td>
        <td>
            Формулировка вопроса
        </td>
        <td>
            Пройдено всего
        </td>
        <td>
            Процент правильно пройденных вопросов
        </td>

    </tr>


    <c:set var="even" scope="page" value="even" />

    <c:forEach items="${userStatList}" var="list">
        <tr>
            <td>${list.userName}</td>
            <td>${list.testName}</td>
            <td>${list.questionDescription}</td>
            <td>${list.numberOfAnswer}</td>
            <td>${list.percentOfRightAnswer}</td>
        </tr>
        <c:if test="${even == null}">
            <div class="alert alert-danger">
                <p>Invalid username and password</p>
            </div>
        </c:if>
    </c:forEach>



</table>



<a href="<c:url value="/user/main"/>"> Назад </a>

</body>
</html>
