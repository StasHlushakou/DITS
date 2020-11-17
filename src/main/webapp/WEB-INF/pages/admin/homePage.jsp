<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 11.11.2020
  Time: 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hello, Admin</title>
</head>
<body>

<div>
    <br> <a href="<c:url value="/admin/createTest"/>">Создать тест</a><br>
    <br> <a href="<c:url value="/admin/createUser"/>">Создать пользователя</a><br>
    <br> <a href="<c:url value="/admin/showStatistic"/>">Статистика</a><br>
</div>

</body>
</html>
