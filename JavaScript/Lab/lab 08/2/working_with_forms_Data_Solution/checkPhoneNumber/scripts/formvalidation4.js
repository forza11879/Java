
$(document).ready(function () {
    var result = document.querySelector('#result');
    var form = document.querySelector('form');

    form.addEventListener('submit', function (e) {
        e.preventDefault();
        // alert("here");
        checkPhoneNumber(this.phone.value);
    });
});

function checkPhoneNumber(phoneNo) {
    var phoneRE = /^\(\d\d\d\) \d\d\d-\d\d\d\d$/;
    if (phoneNo.match(phoneRE)) {
        result.innerHTML = 'The phone number is <strong>valid!</strong>';
    } else {
        result.innerHTML = 'The phone number is <strong>invalid!</strong>';
    }
}