'use strict';
$(document).ready(function () {
    $.post("/setTodoList", function (result) {
        var str = "";
        str += "<tr>";
        str += "<td> No </td>";
        str += "<td> Title </td>";
        str += "<td> Priority </td>";
        str += "<td> Deadline </td>";
        str += "<td> IsComplete </td>";
        $("#table").html(str);
        for (var i = 0; i < result.length; i++) {
            str += "<tr class='row'>";
            str += "<td>" + i + "</td>";
            str += "<td>" + result[i].title + "</td>";
            str += "<td>" + result[i].priority + "</td>";
            str += "<td>" + moment.utc(result[i].deadline).format('YYYY-MM-DD');
            +"</td>";
            str += "<td>" + result[i].isComplete + "</td>";
            str += "</tr>";
            $("#table").html(str);

        }
    });
    $("<style>").text(".row { cursor: pointer; } ").appendTo("head");
});
// $(document).bind("click", "#row", function(){
//     console.dir("")
// } );
$(document).bind("click", ".row", function (event) {
    var str = event.target.childNodes[0];
    console.dir(str.parentNode.parentNode.childNodes[0].textContent);
});