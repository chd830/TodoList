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
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/detail.js" rel="stylesheet" type="text/css">
</head>
<body>
<div id="wrapper">
    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <h1>INPUT DATA</h1>
        </div>

        <div class="panel-body">
            <form id="input_data_form" class="form-horizontal" role="form">

                <div id="data_alert" style="display:none" class="alert alert-danger">
                    <p>Error:</p>
                    <span></span>
                </div>

                <div class="form-group">
                    <label class="col-md-3 control-label">Title</label>
                    <div class="col-md-9">
                        ${model.title}
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-3 control-label">Content</label>
                    <div class="col-md-9">
                        ${model.content}
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-3 control-label">Deadline</label>
                    ${model.deadline}
                </div>
                <div class="form-group">
                    <label class="col-md-3 control-label">Complete</label>
                    ${model.complete}
                </div>
                <div style="border-top: 1px solid #999; padding-top:20px" class="form-group">
                    <div class="col-md-offset-3 col-md-9">
                        <button id="update" type="button" class="btn btn-success">Update Data</button>
                        <button id="delete" type="button" class="btn btn-success">Delete Data</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<script src="/resources/js/detail.js"></script>
<script src="/resources/js/moment.js"></script>
</body>
</html>
