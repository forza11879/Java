// JavaScript source code

//$("ul.mainmenu li").children("ul").addClass("show");

$(document).ready(
function () {
    $("ul.mainmenu li").hover(display, hide);
});

function display(event) {
    //  $(event.currentTarget).children("ul").addClass("show");
    //  $(event.currentTarget).children("ul").show();
    $(event.currentTarget).children("ul").slideDown("slow");
}

function hide(event) {
   // $(evwnt.currentTarget).children("ul").removeClass("show");
    $(event.currentTarget).children("ul").hide();
}





















