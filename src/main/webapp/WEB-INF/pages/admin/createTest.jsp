<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 29.11.2020
  Time: 4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Создать тест</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<div>
    <form method="post" action="/admin/addNewTest" id="addNewTestForm">
        <p>
            <label for="test">Выберите тест</label>
        </p>
        <p>
            <select id="test">
                <c:forEach items="${tests}" var="test">
                    <option value="${test}">${test}</option>
                </c:forEach>
            </select>
        </p>
        <table id="questionTable">
            <thead>
            <tr>
                <th>Вопросы</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <input name="newQuestion" type="text" list="questions" placeholder="Выберите вопрос"
                           id="newQuestion">
                    <datalist id="questions">
                        <c:forEach items="${questions}" var="question">
                        <option value="${question}">
                            </c:forEach>
                    </datalist>
                </td>
            </tr>
            </tbody>
        </table>
        <button type="button" id="btn1">Добавить вопрос</button>
        <input type="submit" id="addNewTest" name="addNewTest" value="Добавить тест" data-method="add">
    </form>

    <script>
        $().ready(function () {
            var i = 0;
            $('#btn1').click(function () {
                var rowNumber = i + 1;
                var indx = i++;
                var text = $('#newQuestion').val();
                var newRow = $('<tr><td id="row"> ' + rowNumber + '. ' + text + '</td></tr>');
                newRow.insertBefore($('#questionTable tbody tr:nth(' + indx + ')'));
            });
        });
    </script>
    <script>
        $().ready(function () {
            $("#addNewTestForm").submit(function (e) {

                e.preventDefault();

                var topic = $("#addNewTestForm #topic").val();
                var test = $("#addNewTestForm #test").val();
                var questions = $("#questionTable #row").text();

                $.ajax({
                    url: "/admin/addNewTest",
                    type: "POST",
                    data: {topic: topic, test: test, questions: questions},
                    cache: false,
                    success: function (data) {
                        window.location.href = data;
                    },
                    error: function () {
                        alert("Произошла ошибка");
                    }
                });
            });
        });
    </script>
</div>
</body>
</html>
