<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User start page</title>
</head>
<body>

<a href="<c:url value="/logout"/>"> Log out </a>
<h1>Hello ${info}</h1>

</body>
</html>
