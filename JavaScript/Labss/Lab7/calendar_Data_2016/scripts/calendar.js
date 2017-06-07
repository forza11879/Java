// JavaScript source code for Chamberlain Civic Center Web page
// Script date : December 16, 2016
// Developed by: Andrei Sinkevich

/*
 *  Function List
 * 1) getCalendar(calendarDay) creates the calendar table for the month specified in the calendarDay parameter.
 * The current date is highlighted in the table
 * 
 * 2) writeCalTitle(calendarDay) - writes the title row in the calendar table
 * 
 * 3) writeDayNames() - write the weekday title rows in the calendar table
 * 
 * 4) daysInMonth(calendarDay) - returns the number of days in the month from calendarDay parameter
 * 
 * 5) writeCalDays(calendarDay) - writes the daily rows in the calendar table, highlighting calendarDay
 * 
 */

// 1) getCalendar(calendarDay) creates the calendar table for the month specified in the calendarDay parameter.
// The current date is highlighted in the table

function getCalendar(calendarDay) {
    if (calendarDay !== null) {
        var calDate = new Date(calendarDay)
    } else {
        calDate = new Date();
    }
    document.write("<table id='calendar_table'>");
    writeCalTitle(calDate);
   //call writeDayNames function
    writeDayNames();
    writeCalDays(calDate);

    // close the table
    document.write("</table>");


}// end function getCalendar

// 2) writeCalTitle(calendarDay) - writes the title row in the calendar table
function writeCalTitle(calendarDay) {
    var monthName = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

    // extract from the calendarDay the month and the year
    var thisMonth = calendarDay.getMonth();
    var thisYear = calendarDay.getFullYear();
    // display the month and year in the table
    document.write("<tr>");
    document.write("<th id='calendar_head' colspan='7'>");
    document.write(monthName[thisMonth] + " " + thisYear);
    document.write("</th>");
    document.write("</tr>");


} // end function writeCalTitle

// 3) writeDayNames() - write the weekday title rows in the calendar table
function writeDayNames() {
    var dayName = new Array("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

    document.write("<tr>");
    for (var dayCount = 0; dayCount < dayName.length; dayCount++) {
        document.write("<th>" + dayName[dayCount] + "</th>");
    } // end for loop
    document.write("</tr>");
}

//4) daysInMonth(calendarDay) - returns the number of days in the month from calendarDay parameter

function daysInMonth(calendarDay) {
    // extract from the calendarDay the month and the year
    var thisMonth = calendarDay.getMonth();
    var thisYear = calendarDay.getFullYear();

    var dayNumber = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

    //check if the current year is a leap year 
    if (thisYear % 4 === 0) {
        if ((thisYear % 100 !== 0) || (thisYear % 400 === 0)) {
        dayNumber[1] = 29; // change February days
    } // end of inner loop
}// end of outer loop
    // return the number of days in the carrent month
    return (dayNumber[thisMonth]);

} // end daysInMonth(calendarDay)


// 5) writeCalDays(calendarDay) - writes the daily rows in the calendar table, highlighting calendarDay

function writeCalDays(calendarDay) {
    var currentDay = calendarDay.getDate();

    //determing the starting day of the month
    var dayCount = 1;
    var totalDays = daysInMonth(calendarDay);

    //set the date to the 1st day of the month
    calendarDay.setDate(1);
    //return the day of the week of the 1st day
    var weekDay = calendarDay.getDay();
    //write blanc cells preceeding the starting date
    document.write("<tr>");

    for (var weekD = 0; weekD < weekDay; weekD++) {
        document.write("<td>&nbsp;</td>");
    }
    //write cells for each day of the month
    while (dayCount <= totalDays) {
        //write the table rows and cells
        if (weekDay === 0 && dayCount !== 1) {
            document.write("</tr>");
        } // end if
        if (dayCount == currentDay) {
            // highlight the current day
            document.write("<td class='calendar_dates' id='calendar_today'>" + dayCount + "</td>");
        } // end if
        else {
            document.write("<td class='calendar_dates'>" + dayCount + "</td>");
        } // end else
        if (weekDay === 6) {
            document.write("</tr>");
        }//end if clause
        // move to the next day
        dayCount++;
        calendarDay.setDate(dayCount);
        weekDay = calendarDay.getDay();
    } // end of while loop
    //close tr tag
    document.write("</tr>");

} // end function writeCaldays