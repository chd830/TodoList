$.post("/setTodoList", function (result) {
    var str = "";
    console.dir(result[0]);
    1558051200000
    1558396800000
    for(var i = 0 in result) {
        str += "<tr>";
        str += "<td>" + i + "</td>";
        str += "<td>" + result[i].title + "</td>";
        str += "<td>" + result[i].priority + "</td>";
        str += "<td>" + moment.utc(result[i].deadline).format('YYYY-MM-DD'); + "</td>";
        str += "<td>" + result[i].isComplete + "</td>";
        str += "</tr>";
        $("#table").html(str);
    }
})