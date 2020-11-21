<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Choise</title>
    <script src="//ajax.googleapis.com/ajax/lobs/jquery/1.9.1/jquery.min.js"></script>
</head>
<body>

    <form action="/user/question">
        <select id="themes" name="themes">
            <c:forEach items="${topic}" var="topic">
                <option>${topic.name}</option>
            </c:forEach>

        </select>

        <br>

        <select id="test" name="testName">
                <option>Choose test</option>
        </select>

        <br>





    </form>

    <a href="<c:url value="/user/question"/>"> Take the test </a>

</body>
</html>
