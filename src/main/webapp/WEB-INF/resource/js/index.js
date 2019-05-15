$.get("/map", function (result) {
        for (var i = 0 in result.length) {
            console.log(result);
        }
    }
);
console.log("test");