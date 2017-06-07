/*
   JavaScript & AJAX Assignment 01 
   Developed By: 
   Developed Date:   

   Function List:
   addTime(oldtime, milliseconds)
      Used to add a specified number of milliseconds to a date object named oldtime.
      A new date object with the new time value is returned by the function.

   showTime(time)
      Displays a time value in the format:
      hh:mm AM/PM
*/

/*
   JavaScript & AJAX Assignment 01 
   Developed By: Andrei Sinkevich
   Developed Date:  13 Dec 2016 

   Function List:
   addTime(oldtime, milliseconds)
      Used to add a specified number of milliseconds to a date object named oldtime.
      A new date object with the new time value is returned by the function.

   showTime(time)
      Displays a time value in the format:
      hh:mm AM/PM
*/


// create the addTime() function
function addTime(oldTime, milliSeconds) {
    // create a variable that contains the current date and time
    var newTime = new Date();
    var newValue = oldTime.getTime() + milliSeconds;

    newTime.setTime(newValue);

    return newTime;
}

function showTime(time) {
    var newTime = new Date();
    var currentHours = time.getHours();
    var currentMinutes = time.getMinutes();

    var ampm = (currentHours < 12) ? "AM" : "PM";
    currentMinutes = (currentMinutes < 10) ? ("0" + currentMinutes) : currentMinutes;
    currentHours = (currentHours > 12) ? (currentHours - 12) : currentHours;

    return currentHours + ":" + currentMinutes + ampm;
}





