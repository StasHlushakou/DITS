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
    <title>CreateUser</title>
</head>
<body>
<div class="CreateUser">
    <form:form method="post" action="/admin/createUser" modelAttribute="user">
        <table>
            <tr>
                <td><form:select path="roleSet"><form:options items="${allRoles}" itemLabel="role"/></form:select></td>
            </tr>
            <tr>
                <td><form:input path="lastName" placeholder="Фамилия" required="true"/></td>
            </tr>
            <tr>
                <td><form:input path="firstName" placeholder="Имя" required="true"/></td>
            </tr>
            <tr>
                <td><form:input path="login" placeholder="Логин" required="true"/></td>
            </tr>
            <tr>
                <td><form:password path="password" placeholder="Пароль" required="true"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Сохранить пользователя"/></td>
            </tr>
        </table>
    </form:form>
</div>

<form action="/goHomeAdmin">
    <input type="submit" value="Назад">
</form>
</body>
</html>
