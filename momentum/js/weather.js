const API_KEY = "71892548e1a76b847c4a8f73fb09de33";

function onGeoOk(position) {
    const lat = position.coords.latitude;
    const lng = position.coords.longitude;
    const url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lng}&units=metric&lang=kr&appid=${API_KEY}`
    fetch(url).then(response => response.json().then(data => {
        const city = document.querySelector("#weather span:first-child");
        city.innerText = data.name;
        const weather = document.querySelector("#weather span:last-child");
        weather.innerText = `/ ${data.main.temp} / ${data.weather[0].description}`;
    }));
}

function onGeoError() {
    alert("Cannot locate")
}

navigator.geolocation.getCurrentPosition(onGeoOk, onGeoError);

/*

*/