'use strict';
var check = 0;
$('#setDeadline').hide();
$('#deadlineBtn').click(function () {
    if (check === 1) {
        $('#setDeadline').hide();
        $(this).html('Add Deadline');
        check = 0;
    }
    else {
        $('#setDeadline').show();
        $(this).html('Remove Deadline');
        check = 1;
    }
});
$('#input').click(function () {
    var title = $('#title').val();
    var content = $('#content').val();
    var priority = $('#priority').val();
    if (priority > 5) {
        alert("The number of priorities is greater than 5.");
        $('#title').val("");
        $('#content').val("");
        $('#priority').val("");
    }
    else if (check === 0) {
        $.post('/setTodoWithoutDeadline', {
            title: title,
            content: content,
            priority: priority
        }, function () {
            location.href = "/";
        })
    }
    else {
        var deadline = $('#deadline').val();
        var deadlineArr = deadline.split('-');
        var date = new Date().toISOString().substr(0, 10).replace('T', ' ');
        var dateArr = date.split('-');
        console.log(deadlineArr[0] + "," + deadlineArr[1] + "," + deadlineArr[2]);
        console.log(dateArr[0] + "," + dateArr[1] + "," + dateArr[2]);

        if (deadlineArr[0] < dateArr[0]) {
            alert("You have chosen an old date");
            $('#title').val("");
            $('#content').val("");
            $('#priority').val("");
        }
        else if (dateArr[1] > deadlineArr[1]) {
            alert("You have chosen an old date");
            $('#title').val("");
            $('#content').val("");
            $('#priority').val("");
        }
        else if(dateArr[1] < deadlineArr[1] && dateArr[2] > deadlineArr[2]) {
            alert("You have chosen an old date");
            $('#title').val("");
            $('#content').val("");
            $('#priority').val("");
        }
        else {
            $.post('/setTodo', {
                title: title,
                content: content,
                deadline: deadline,
                priority: priority
            }, function () {
                location.href = "/";
            });
        }

    }

});
