"use strict";
var getNumber = function (a, b, c) {
    return a + b + (c ?? 0);
};
console.log(getNumber(1, 2)); // Output: NaN (since c is undefined)
