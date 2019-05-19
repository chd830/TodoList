'use strict';
$(document).ready(function () {
    $.post("/setTodoList", function (result) {
        var str = "";
        str += "<tr>";
        str += "<td> No </td>";
        str += "<td> Title </td>";
        str += "<td> Priority </td>";
        str += "<td> Deadline </td>";
        str += "<td> Complete </td>";
        $("#table").html(str);
        for (var i = 0; i < result.length; i++) {
            if (result[i] == null) continue;
            str += "<tr class='row'>";
            str += "<td>" + i + "</td>";
            str += "<td>" + result[i].title + "</a></td>";
            str += "<td>" + result[i].priority + "</td>";
            if (result[i].deadline === null) str += "<td></td>";
            else str += "<td>" + result[i].deadline + "</td>";
            str += "<td>" + result[i].complete + "</td>";
            str += "</tr>";
            $("#table").html(str);
        }

    });
    $("<style>").text(".row { cursor: pointer; } ").appendTo("head");
});

$(document).bind("click", ".row", function (event) {
    var str = event.target.childNodes[0];
    console.dir(str);
    if (str.textContent == "false") {
        var todoNo = str.parentNode.parentNode.childNodes[0].textContent;
        todoNo *= 1;
        todoNo += 1;
        var title = str.parentNode.parentNode.childNodes[1].textContent;
        $.post('/updateIsComplete', {
            todoNo: todoNo,
            isComplete: true
        }, function () {
            str.textContent = "true";
        })
    }
    else if (str.textContent == "true") {
        var todoNo = str.parentNode.parentNode.childNodes[0].textContent;
        todoNo *= 1;
        todoNo += 1;
        var title = str.parentNode.parentNode.childNodes[1].textContent;
        $.post('updateTodo', {
            todoNo: todoNo,
            isComplete: 0
        }, function () {
            str.textContent = "false";
        })
    }

    else {
        str = str.parentNode.parentNode.childNodes[0].textContent;
        str *= 1;
        console.log(str);
        if (str === 0) location.href = '/input';
        else {
            str += 1;
            $.get('/getTodo?todoNo=' + str, function (result) {
                document.write(result);
            });
        }
    }
});