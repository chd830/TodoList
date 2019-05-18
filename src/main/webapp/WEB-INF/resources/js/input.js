'use strict';
$('#input').click(function () {
    var title = $('#title').val();
    var content = $('#content').val();
    var deadline = $('#deadline');
    deadline = new Date(deadline[0].value);

    $.post('/setTodo', {
        title: title,
        content: content,
        deadline: deadline,
    }, function () {
        console.log("title:" + title + "\n" + "content:" + content + "\n" + "deadline:" + deadline + "(log)");
    });
});
