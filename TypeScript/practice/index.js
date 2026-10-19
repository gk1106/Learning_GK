"use strict";
function getLocation(lat, lng) {
    const latitude = lat;
    const longitude = lng;
    return { latitude, longitude };
}
console.log(getLocation(40.7128, -74.0060)); // Example usage with latitude and longitude for New York City
