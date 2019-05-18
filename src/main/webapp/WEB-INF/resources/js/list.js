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
            str += "<tr class='row'>";
            str += "<td>" + i + "</td>";
            // var num = (i+1)*1;
            // str += "<td>" +"<a href=\"/getTodo?num="+num+"\">" +  result[i].title + "</a></td>";
            str += "<td>" + result[i].title + "</a></td>";
            str += "<td>" + result[i].priority + "</td>";
            str += "<td>" + moment.utc(result[i].deadline).format('YYYY-MM-DD')+"</td>";
            str += "<td>" + result[i].complete + "</td>";
            str += "</tr>";
            $("#table").html(str);

        }
    });
    $("<style>").text(".row { cursor: pointer; } ").appendTo("head");
});
$(document).bind("click", ".row", function (event) {
    var str = event.target.childNodes[0].parentNode.parentNode.childNodes[0].textContent;
    str *= 1 ;
    $.get('/getTodo?num='+(str+1),{
    }, function(result) {
        document.write(result);
    })

});