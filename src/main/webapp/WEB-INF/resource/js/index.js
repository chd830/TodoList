$.post("/setTodoList", function (result) {
    var str = "";
    for(var i = 0 in result) {
        str += "<tr>";
        str += "<td>" + result[i].title + "</td>";
        str += "<td>" + result[i].priority + "</td>";
        str += "<td>" + result[i].isComplete + "</td>";
        str += "</tr>";
        $("#table").html(str);
    }
})