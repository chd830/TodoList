'use strict';
var check = 0;
$('#setDeadline').hide();
$('#deadlineBtn').click(function() {
    console.log(check);
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
    var deadline = $('#deadline').val();
    var priority = $('#priority').val();
    $.post('/setTodo', {
        title: title,
        content: content,
        deadline: deadline,
        priority: priority
    }, function () {
        location.href = "/";
    });
});
