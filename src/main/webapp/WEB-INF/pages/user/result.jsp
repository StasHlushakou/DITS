<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/result.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/general.css" />">
</head>
<body>

<table>

    <tr>
        <td>
            Название вопроса
        </td>
        <td>
            Правильно
        </td>
        <td>
            Рекомендуемая литература
        </td>
        <td>
            Рекомендуемые ссылки на литературу
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
<a href="<c:url value="/user/main"/>"> Назад </a>

</body>
</html>
