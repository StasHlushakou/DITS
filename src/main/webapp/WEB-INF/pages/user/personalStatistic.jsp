<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Personal statistic</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/personalStatistic.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/table.css" />">
</head>
<body>


<table>

    <th>
        Ф.И.О.
    </th>
    <th>
        Название теста
    </th>
    <th>
        Формулировка вопроса
    </th>
    <th>
        Пройдено всего
    </th>
    <th>
        Процент правильно пройденных вопросов
    </th>



    <c:set var="even" scope="page" value="true" />



    <c:forEach items="${userStatList}" var="list">

        <c:set var="control" scope="page" value="true" />

        <c:if test="${even == true}">
            <tr class="even">
            <c:set var="even" scope="page" value="false" />
            <c:set var="control" scope="page" value="false" />
        </c:if>

        <c:if test="${control==true && even==false}">
            <tr >
            <c:set var="even" scope="page" value="true" />
        </c:if>

            <td>${list.userName}</td>
            <td>${list.testName}</td>
            <td>${list.questionDescription}</td>
            <td>${list.numberOfAnswer}</td>
            <td>${list.percentOfRightAnswer}</td>
        </tr>

    </c:forEach>



</table>



<a id="back" href="<c:url value="/user/main"/>"> Назад </a>

</body>
</html>
