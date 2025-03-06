function getWeather() {
    fetch("weather_data.txt")
    .then(response => response.text())
    .then(data => {
        document.getElementById("weatherData").innerText = data;
        document.getElementById("weatherData").style.fontSize = "5em";
        document.getElementById("weatherData").style.fontWeight = "bold";
    });
}
