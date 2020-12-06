<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User main page</title>
</head>
<body>

    <br>
    <a href="<c:url value="/user/choice"/>"> Выбор темы и теста </a>

    <br>
    <br>

    <a href="<c:url value="/user/personalStatistic"/>"> Личная статистика </a>

    <br>
    <br>

    <a href="<c:url value="/logout"/>"> Выйти </a>

</body>
</html>
