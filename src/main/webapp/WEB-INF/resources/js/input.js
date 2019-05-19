'use strict';
var check = 0;
$('#setDeadline').hide();
$('#deadlineBtn').click(function() {
    if(check === 1) {
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
    console.dir($('#title'));
    if(priority > 5) {
        alert("Priority is bigger than 5");
        $('#title').val("");
        $('#content').val("");
        $('#priority').val("");
    }
    else if(check === 0) {
        var deadline = $('#deadline').val();
        $.post('/setTodoWithoutDeadline', {
            title: title,
            content: content,
            deadline: deadline,
            priority: priority
        }, function() {
            location.href = "/";
        })
    }
    else {
        $.post('/setTodo', {
            title: title,
            content: content,
            priority: priority
        }, function () {
            location.href = "/";
        });
    }

});
