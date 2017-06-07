// JavaScript source code for Hands On Project
//your name - Ion Leahu, today’s date - 20/12/2016



function display(event) {
    $(event.currentTarget).next().fadeIn("slow");
}

function hide(event) {

    //$(event.currentTarget).children("h3").hide();
    $(event.currentTarget).next().fadeOut("slow");
}




//$("h3").click(display, hide);
$("h3").click(display);
$("h3").dblclick(hide);







