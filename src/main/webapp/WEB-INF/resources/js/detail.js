'use strict';

$(document).ready(function() {
    $.get("/getTodo", function(result) {
        $('#title').text(result.title);
        $('#content').text(result.content);
        $('#deadline').text(moment.utc(result.deadline).format('YYYY-MM-DD'));
        $('#check').text(result.check);
    });
});
