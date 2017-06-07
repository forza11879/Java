// JavaScript source code
function display(event) {
    $(event.currentTarget).next().fadeIn("slow");
}

function hide(event) {

    $(event.currentTarget).children("h3").hide();
    $(event.currentTarget).next().hide();
}




//$("h3").click(display, hide);
$("h3").hover(display, hide);