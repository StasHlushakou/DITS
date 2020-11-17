<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <sec:authorize access="user">
        <p><a class="btn btn-lg btn-success" href="<c:url value="/user/main" />" role="button">Sign in how user</a></p>
    </sec:authorize>

    <sec:authorize access="admin">
        <p><a class="btn btn-lg btn-success" href="<c:url value="/admin" />" role="button">Sign in how admin</a></p>
    </sec:authorize>

    <sec:authorize access="mentor">
        <p><a class="btn btn-lg btn-success" href="<c:url value="/mentor" />" role="button">Sign in how mentor</a></p>
    </sec:authorize>

</body>
</html>
