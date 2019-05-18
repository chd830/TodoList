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
<div>Title<input name="title" id="title" size="80" value="${model.title}"></div>
<div>Completet<input name="complete" id="complete" size="80" value="${model.complete}"></div>
<div>Content<input name="content" id="content" size="80" value="${model.content}"></div>
<div>Deadline<input name="deadline" id="deadline" size="80" value="${model.deadline}"></div>


<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<script src="/resources/js/detail.js"></script>
<script src="/resources/js/moment.js"></script>
</body>
</html>
