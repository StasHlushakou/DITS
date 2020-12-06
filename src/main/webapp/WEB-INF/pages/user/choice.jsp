<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Choise</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/choice.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/general.css" />">
</head>
<body>

<p><img src="<c:url value="/resources/user/human1.png" />"></p>

<div id="right">


    <select id="topic" name="topic" onchange="sendTopicName()" required>
        <c:forEach items="${topicNames}" var="topic">
            <option value="${topic.topicId}">${topic.name}</option>
        </c:forEach>
    </select>

    <form name="form" action="<c:url value="/user/startTest"/>" method="get">

        <br>
        <br>

        <select id="testId" name="testId" required>
            <option>Choose test</option>
        </select>

        <br>

        <input type="submit" class="submit-button" value="Пройти тестирование">
    </form>

</div>






<script type="text/javascript">

    function sendTopicName(){
        let topicLet = {};
        topicLet.name = null;
        topicLet.description = null;
        topicLet.topicId = Number(topic.value);
        topicLet.testSet = null;
        xhrRequestToServer("POST", "<c:url value="/user/choice"/>",topicLet);
    }

    function xhrRequestToServer(method, url, json) {
        let xhr = new XMLHttpRequest();
        xhr.open(method, url);
        xhr.setRequestHeader('Content-Type', 'application/json;charset=utf-8');
        xhr.send(JSON.stringify(json));
        xhr.onload= function() {
            let testList = JSON.parse(xhr.response);
            let objSel = document.form.testId;
            objSel.options.length = 0;
            for (let i = 0; i < testList.length; i++){
                objSel.options[objSel.options.length] = new Option(testList[i].name, testList[i].testId);
            }
        };
        xhr.onerror= function() {
            alert(`Some problem with connection to server`);
        };

    }

    sendTopicName();
</script>

</body>
</html>
