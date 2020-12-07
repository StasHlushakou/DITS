<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User main page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/main.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/image.css" />">
</head>
<body>


<p><img src="<c:url value="/resources/user/human1.png" />"></p>

    <div id="right">
        <div id="center">
            <a href="<c:url value="/user/choice"/>"> Выбор темы и теста </a>
            <br>
            <br>
            <br>
            <a href="<c:url value="/user/personalStatistic"/>"> Личная статистика </a>
            <br>
            <br>
            <br>
            <a href="<c:url value="/logout"/>"> Выйти </a>
        </div>
    </div>


</body>
</html>
