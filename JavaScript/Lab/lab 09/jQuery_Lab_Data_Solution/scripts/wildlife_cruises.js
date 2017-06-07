// JavaScript source code for wildlife cruises
// script date : December 20, 2016

//$("ul.mainmenu li").children("ul").addClass("show");



$(document).ready(

    function () {

        $("ul.mainmenu li").hover(display, hide);
    }
      );

function display(event) {

    // $("ul.mainmenu li").children("ul").addClass("show");
    //$(event.currentTarget).children("ul").addClass("show");
    //$(event.currentTarget).children("ul").show();
    $(event.currentTarget).children("ul").slideDown("fast");



}

function hide(event) {

    // $(event.currentTarget).children("ul").removeClass("show");
    $(event.currentTarget).children("ul").hide();

}




