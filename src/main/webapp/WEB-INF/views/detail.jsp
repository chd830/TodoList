<%--
  Created by IntelliJ IDEA.
  User: chd96
  Date: 2019-05-17
  Time: 오후 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="title">${model.getTitle()}</div>
<div id="content">${model.content}</div>
<div id="deadline">${model.deadline}</div>
<div id="check">${model.complete}</div>

<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<script src="/resources/js/detail.js"></script>
<script src="/resources/js/moment.js"></script>
</body>
</html>
