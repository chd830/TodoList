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
        for (var i = 0 in result) {
            str += "<tr id='row'>";
            str += "<td>" + i + "</td>";
            str += "<td>" + result[i].title + "</td>";
            str += "<td>" + result[i].priority + "</td>";

            str += "<td>" + moment.utc(result[i].deadline).format('YYYY-MM-DD');
            +"</td>";
            str += "<td>" + result[i].isComplete + "</td>";
            str += "</tr>";
            $("#table").html(str);
            $('tr>td:first').css("background-color", "red");

        }
    });
    $("<style>").text("#row { cursor: pointer; } ").appendTo("head");
});
$(document).bind("click", "#row", function(){
    console.log("clicked");
} );