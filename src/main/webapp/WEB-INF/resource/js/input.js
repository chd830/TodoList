'use strict';
var check;
$('#true').click(function () {
    check = true;
});
$('#false').click(function () {
    check = false;
});
$('#input').click(function () {
    var title = $('#title').val();
    var content = $('#content').val();
    var deadline = $('#deadline');
    deadline = deadline[0].value;

    $.post('/input', {
        title: title,
        content: content,
        deadline: deadline,
        isComplete: check
    }, function () {
        console.log("title:" + title + "\n" + "content:" + content + "\n" + "deadline:" + deadline + "\n" + "isComplete: " + check + "(log)");
    });
});
