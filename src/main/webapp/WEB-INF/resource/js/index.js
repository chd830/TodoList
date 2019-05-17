$.post("/getList", function (result) {
    console.dir(result);
    for(var i = 0 in result) {
        document.write("<table>")
        document.write("<tr>")
        document.write("<td>" + result[i].title + "</td>");
        document.write("<td>" + result[i].priority + "</td>");
        document.write("<td>" + result[i].isComplete + "</td>");
        document.write("</tr>");
        documentg.write("</table>");
    }
})