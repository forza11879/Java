// JavaScript source code for GPS-ware Web page

// create a function today() that returns the current date
// in the format mm/dd/yyyy

function today() {
    var now = new Date();
    //extract from the now object the date, month and full year
    var thisDate = now.getDate();
    var thisMonth = now.getMonth() + 1;
    var thisYear = now.getFullYear();

    var currentDate = thisMonth + "/" + thisDate + "/" + thisYear;
    return currentDate;
}
