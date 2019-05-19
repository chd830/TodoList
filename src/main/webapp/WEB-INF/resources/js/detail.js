'use strict';
$('#delete').click(function() {
    var todoNo = $('#todoNo').text();
    todoNo *= 1;
    $.post('/deleteTodo', {
        todoNo: todoNo
    },function() {
        console.log("delete");
    });
});

$('#update').click(function() {
    var todoNo = $('#todoNo').text();
    var title = $('#title').text();
    title = title.replace(/ /gi, "");
    title = title.replace(/\n/g, "");
    var content = $('#content').text();
    content = content.replace(/ /gi, "");
    content = content.replace(/\n/g, "");
    var deadline = $('#deadline').text();
    deadline = deadline.replace(/  /gi, "");
    deadline = deadline.replace(/\n/g, "");
    console.log(deadline);
    var complete = $('#complete').text();
    complete = complete.replace(/  /gi, "");
    complete = complete.replace(/\n/g, "");
    $.post('/updateTodo',{
        todoNo: todoNo,
        title: title,
        content: content,
        deadline: deadline,
        isComplete: complete
    }, function() {
        console.log("update");
    });
});
