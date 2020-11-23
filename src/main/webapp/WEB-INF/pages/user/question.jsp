<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Question</title>
</head>
<body>


${question.description}

<br>

<form name="form" action="<c:url value="/user/nextQuestion"/>" method="get">
    <select id="topic" name="topic" onchange="sendTopicName()" required>
        <c:forEach items="${question.answerSet}" var="answer">
            <input type="checkbox" value="${answer.answerId}">${answer.description}<Br>
        </c:forEach>
    </select>

    <input type="submit" class="submit-button" value="Next question">


</form>


</body>
</html>
