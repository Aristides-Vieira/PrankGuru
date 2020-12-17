

$(document).ready(function() {
    a();
})

var a = function update() {

    var parameters = location.search.substring(1).split("&");

    var temp = parameters[0].split("=");
    var l = unescape(temp[1]);
    temp = parameters[1].split("=");
    var p = unescape(temp[1]);

    $("#youtube-div").append(
        '<iframe width="100%" height="650" src="' + l + '"></iframe>'
        );
    $("#description-div").append('<p>' + p + '</p>');
};