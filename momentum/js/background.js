
const images =[
    "winter1.jpeg",
    "winter2.jpeg",
    "winter3.jpeg"
];

const chosenImage = images[Math.floor(Math.random()*images.length)];

const backgroundImage = document.createElement("img");

backgroundImage.src = `img/${chosenImage}`;

document.body.appendChild(backgroundImage);