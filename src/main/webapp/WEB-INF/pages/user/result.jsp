<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>

<table>

    <tr>
        <td>
            Question description
        </td>
        <td>
            Result
        </td>
        <td>
            Reccomend literature
        </td>
        <td>
            Reccomend link
        </td>

    </tr>


    <c:forEach items="${userResultModelList}" var="userResult">
        <tr>
            <td>${userResult.description}</td>
            <td>${userResult.isCorrect}</td>

            <td>
                <c:forEach items="${userResult.literatureList}" var="literature">
                    ${literature}
                    <br>
                </c:forEach>
            </td>

            <td>
                <c:forEach items="${userResult.linkList}" var="link">
                    <a href="${link}"> ${link} </a>
                    <br>
                </c:forEach>
            </td>

        </tr>
    </c:forEach>



</table>





<br>
<a href="<c:url value="/user/personalStatistic"/>"> Personal statistic </a>
<br>
<a href="<c:url value="/user/main"/>"> Main page </a>

</body>
</html>
