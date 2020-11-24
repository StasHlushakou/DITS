<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 15.11.2020
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Создать тест</title>
</head>
<body>
<div>
    <form action="saveNewQuestion">
        <p>
            <input type="text" required list="topics" placeholder="Выберите тему" id="topic">
            <datalist id="topics" name="nameTopics">
                <c:forEach items="${topics}" var="topic">
                <option value="${topic}">
                    </c:forEach>
            </datalist>
        </p>
        <p>
            <input type="text" required list="tests" placeholder="Выберите тест" id="test">
            <datalist id="tests" name="nameTests">
                <c:forEach items="${tests}" var="test">
                <option value="${test}">
                    </c:forEach>
            </datalist>
        </p>
        <p>
            <input type="text" required list="questions" placeholder="Выберите вопрос" id="question">
            <datalist id="questions" name="nameQuestion">
                <c:forEach items="${questions}" var="question">
                <option value="${question}">
                    </c:forEach>
            </datalist>
        </p>
        <input type="submit" value="Отправить">
    </form>
</div>
</body>
</html>
