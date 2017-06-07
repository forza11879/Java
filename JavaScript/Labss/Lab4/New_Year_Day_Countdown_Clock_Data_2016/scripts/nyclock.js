// JavaScript source code for New Year Clock Web page
/*
 * 1. showDate() - returns the current date in the format mm/dd/yyyy
 * 2. showTime() - returns the current time in the format hh:mm:ss
 * 3. calcDays() - returns the number of dayss between the current date and January 1st of the next year
 * 
 */

//showDate() - returns the current date in the format mm//dd/yyyy
function showDate(dateObj) {
    // extract date parts
    var theDate = dateObj.getDate();
    var theMonth = dateObj.getMonth() + 1;
    var theYear = dateObj.getFullYear();

    return theMonth + "/" + theDate + "/" + theYear;
} // end showDate() function

// showTime()
function showTime(dateObj) {
    var thisSecond = dateObj.getSeconds();
    var thisMinute = dateObj.getMinutes();
    var thisHour = dateObj.getHours();
    // change this hour from 24 to 12 (am, pm)
    // 1. If this hour is < 12, that set variable ampm to "am"
    var ampm = (thisHour < 12) ? " am" : " pm";
    // 2. substruct 12 from this.Hour
    thisHour = (thisHour > 12) ? (thisHour - 12) : thisHour;
    // 3. if thisHour equals zero, change it to 12
    thisHour = (thisHour == 0) ? 12 : thisHour;
    // add leading zeros to the minutes and seconds < 10
    thisMinute = (thisMinute < 10) ? ("0" + thisMinute) : thisMinute;
    thisSecond = (thisSecond < 10) ? ("0" + thisSecond) : thisSecond;

    return thisHour + ":" + thisMinute + ":" + thisSecond + ampm;
} // end showTime

// calcDays()
function calcDays(currentDate) {
    // create a date object for January 1st of the next year
    var nextYear = currentDate.getFullYear() + 1;
   
    // insert a temporary date for January 1st
    var newYear = new Date("January 1, 2017");
    // set the newYear to the nextYear
    newYear.setFullYear(nextYear);
    /* calculate the differnce between the current date and January 1st of the next year */
    // convert the milliseconds to days
    var m2D = (1000 * 60 * 60 * 24);
    var theDays = (newYear - currentDate) / m2D;
    return theDays;

}