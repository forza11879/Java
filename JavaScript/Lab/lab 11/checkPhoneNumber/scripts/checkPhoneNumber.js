// JavaScript source code

function checkPhoneNumber(phoneNo) {
    var phoneRE = /^\(\d\d\d\) \d\d\d-\d\d\d\d$/;
    if (phoneNo.match(phoneRE)) {
        return true;
    } else {
        alert("The phone number entered is invalid!");
        return false;
    }
}
