<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Question</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/question.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/image.css" />">
</head>
<body>

<p><img src="<c:url value="/resources/user/human1.png" />"></p>

<div id="right">
    <div id="center">

        ${question.description}

        <br>

        <form name="form" action="<c:url value="/user/nextQuestion"/>" method="get">

            <c:forEach items="${question.answerSet}" var="answer">
                <input name="answersId" type="checkbox" value="${answer.answerId}">${answer.description}<Br>
            </c:forEach>


            <input type="submit" class="submit-button" value="Следующий">

        </form>
    </div>
</div>






</body>
</html>
