'use strict';
$(document).ready(function () {
    $.post("/setTodoList", function (result) {
        var str = "";
        str += "<tr>";
        str += "<td> Number </td>";
        str += "<td>TodoNumber  </td>";
        str += "<td> Title </td>";
        str += "<td> Priority </td>";
        str += "<td> Deadline </td>";
        str += "<td> Complete </td>";
        $("#table").html(str);
        var date = new Date().toISOString().substr(0, 10).replace('T', ' ');
        var dateArr = date.split('-');
        for (var i = 0, j = 0; i < result.length; i++) {
            if (result[i] == null) continue;
            str += "<tr class='row'>";
            str += "<td>" + j + "</a></td>";
            str += "<td>" + i + "</a></td>";
            str += "<td>" + result[i].title + "</a></td>";
            str += "<td>" + result[i].priority + "</td>";
            j += 1;
            if (result[i].deadline === null) str += "<td></td>";
            else {
                str += "<td>" + result[i].deadline + "</td>";
                if (result[i].deadline === date) {
                    alert("The deadline for index " + i + " is today.");
                }
                else {
                    var deadlineArr = result[i].deadline.split('-');
                    if (dateArr[2] > deadlineArr[2]) {
                        $.post('/deleteTodo', {
                            todoNo: (i + 1)
                        });
                    }
                }
            }

            str += "<td>" + result[i].complete + "</td>";
            str += "</tr>";
            $("#table").html(str);
        }
    });
    $("<style>").text(".row { cursor: pointer; } ").appendTo("head");
    $("<style>").text(".row { height: 50px; } ").appendTo("head");
});
$('#input').click(function() {
    location.href = "/input";
})
$(document).bind("click", ".row", function (event) {
    var str = event.target.childNodes[0];
    if (str.textContent == "false") {
        var todoNo = str.parentNode.parentNode.childNodes[1].textContent;
        todoNo *= 1;
        todoNo += 1;
        $.post('/updateIsComplete', {
            todoNo: todoNo,
            isComplete: true
        }, function () {
            str.textContent = "true";
        })
    }
    else if (str.textContent == "true") {
        var todoNo = str.parentNode.parentNode.childNodes[1].textContent;
        todoNo *= 1;
        todoNo += 1;
        $.post('/updateIsComplete', {
            todoNo: todoNo,
            isComplete: 0
        }, function () {
            str.textContent = "false";
        })
    }
    else {
        str = str.parentNode.parentNode.childNodes[1].textContent;
        str *= 1;
        if (str === 0) location.href = '/input';
        else {
            str += 1;
            $.get('/getTodo?todoNo=' + str, function (result) {
                document.write(result);
            });
        }
    }
});