'use strict';
$('#delete').click(function() {
    var todoNo = $('#todoNo').text();
    todoNo *= 1;
    $.post('/deleteTodo', {
        todoNo: todoNo
    },function() {
        location.href="/";
    });
});

$('#update').click(function() {
    var todoNo = $('#todoNo').text();
    var title = $('#title').val();
    var content = $('#content').val();
    $.post('/updateTodo',{
        todoNo: todoNo,
        title: title,
        content: content,
    }, function() {
        location.href = "/";
    });
});
