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
        <input name="answer" type="checkbox" value="${answer.answerId}">${answer.description}<Br>

    </c:forEach>





    <c:if test="${nextQuestion == true}">
        <input type="submit" class="submit-button" value="Next question">
    </c:if>
    <c:if test="${nextQuestion == false}">
        <input type="submit" class="submit-button" value="Go to result">
    </form>
    </c:if>

</form>




</body>
</html>
