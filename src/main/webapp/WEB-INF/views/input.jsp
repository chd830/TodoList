<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap core CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->

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

                <div id="input_data_alert" style="display:none" class="alert alert-danger">
                    <p>Error:</p>
                    <span></span>
                </div>

                <div class="form-group">
                    <label for="title" class="col-md-3 control-label">Title</label>
                    <div class="col-md-9">
                        <input type="text" id="title" class="form-control" name="title" placeholder="Title">
                    </div>
                </div>

                <div class="form-group">
                    <label for="content" class="col-md-3 control-label">Content</label>
                    <div class="col-md-9">
                        <input type="text" id="content" class="form-control" name="Content" placeholder="Content">
                    </div>
                </div>

                <div class="form-group">
                    <label for="deadline" class="col-md-3 control-label">Deadline</label>
                    <input type="date" id="deadline"/>
                </div>

                <div style="border-top: 1px solid #999; padding-top:20px" class="form-group">
                    <div class="col-md-offset-3 col-md-9">
                        <button id="input" type="button" class="btn btn-success">Input Data</button>
                    </div>

                </div>
            </form>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="/webjars/bootstrap/4.1.1/js/bootstrap.bundle.js"></script>
<script src="/resources/js/input.js"></script>
</body>

</html>