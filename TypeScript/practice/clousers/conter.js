"use strict";
function getHomeDetails() {
    let phonenumber = 1234567890;
    return {
        getAddressDetails: function () {
            return phonenumber;
        },
        adPhoneNumber: function () {
            return phonenumber = 1234567890 + 1;
        },
        removePhoneNumber: function () {
            return phonenumber = 0;
        }
    };
}
const getDetails = getHomeDetails();
console.log(getDetails.getAddressDetails()); // Output: 1234567890
console.log(getDetails.removePhoneNumber()); // Output: 0
console.log(getDetails.adPhoneNumber()); // Output: 1234567891
