<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Personal statistic</title>
</head>
<body>


<table>

    <tr>
        <td>
            User name
        </td>
        <td>
            Test name
        </td>
        <td>
            Question
        </td>
        <td>
            Number of answer
        </td>
        <td>
            Percent right answer
        </td>

    </tr>


    <c:forEach items="${userStatList}" var="list">
        <tr>
            <td>${list.userName}</td>
            <td>${list.testName}</td>
            <td>${list.questionDescription}</td>
            <td>${list.numberOfAnswer}</td>
            <td>${list.percentOfRightAnswer}</td>


        </tr>
    </c:forEach>



</table>



<a href="<c:url value="/user/main"/>"> Main page </a>

</body>
</html>
