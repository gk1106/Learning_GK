export function getLocation(lat: number, lng: number) {

    const latitude: number = lat;
    const longitude: number = lng;
    return { latitude, longitude };
}

console.log(getLocation(40.7128, -74.0060)); // Example usage with latitude and longitude for New York City

