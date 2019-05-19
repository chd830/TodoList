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
            str += "<td>" + moment.utc(result[i].deadline).format('YYYY-MM-DD') + "</td>";
            str += "<td>" + result[i].complete + "</td>";
            str += "</tr>";
            $("#table").html(str);
        }

    });
    $("<style>").text(".row { cursor: pointer; } ").appendTo("head");
});
$('#input').click(function () {
    location.href = '/input';
});

$(document).bind("click", ".row", function (event) {
    var str = event.target.childNodes[0];
    if(str.textContent == "false") str.textContent = "true";
    str = str.parentNode.parentNode.childNodes[0].textContent;
    // var str = event.target.childNodes[0].parentNode.parentNode.childNodes[0].textContent;
    str *= 1;
    str += 1;
    if (str === 0) location.href = '/input';
    $.get('/getTodo?todoNo=' + str , function (result) {
        document.write(result);
    });
});