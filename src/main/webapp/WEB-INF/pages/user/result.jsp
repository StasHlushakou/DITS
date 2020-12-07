<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/result.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/table.css" />">
</head>
<body>

<table>

    <th>
        Название вопроса
    </th>
    <th>
        Правильно
    </th>
    <th>
        Рекомендуемая литература
    </th>
    <th>
        Рекомендуемые ссылки на литературу
    </th>

    <c:set var="even" scope="page" value="true" />

    <c:forEach items="${userResultModelList}" var="userResult">

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
<a id="back" href="<c:url value="/user/main"/>"> Назад </a>

</body>
</html>
