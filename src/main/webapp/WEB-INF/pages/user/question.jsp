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

    <c:forEach items="${question.answerSet}" var="answer">
        <input name="answersId" type="checkbox" value="${answer.answerId}">${answer.description}<Br>
    </c:forEach>


    <input type="submit" class="submit-button" value="Next">

</form>




</body>
</html>
