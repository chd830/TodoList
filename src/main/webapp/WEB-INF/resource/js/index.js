$.post("/map", function (result) {
        for (var i = 0 in result.length) {
            console.log(result[i].todoNo);
            console.log(result[i].title);
        }
    }
);
console.log("test");