let userObj;
let latitude=0.0, longitude=0.0;
let count = 0;
let countButton = document.getElementById("counter");
let displayCount = document.getElementById("displayCount");
let displayOutput = document.getElementById("output");
// let deviceId = ${deviceId};
let resetCount;
let timer;
let status = 0;


getLocation();
setTimeout(function(){getLocation();}, 5000);


function countFunction(){
    count++;
    if(count==1) {
        timeOut(3000);
        //sendStatus();
    }

    else if (count > 1 && count < 4){
        clearTimeout(resetCount);
        status = 1;
        sendInfo();
        //sendStatus();
    }

    else if(count>3) {
        status = 0;
        //sendStatus();
        timeOut(0);
    }
}

function timeOut(y){
    resetCount = setTimeout(function(){count = 0;}, y);
}


function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    }
    else {
        alert("Geolocation is not supported by this browser.");
    }
}

function showPosition(position) {
    latitude = position.coords.latitude;
    longitude = position.coords.longitude;
}

function sendInfo(){

    userObj = {id: 1, uid:1, pid:1, xCoordinates : longitude, yCoordinates: latitude, noOfClick: count, active: status};

    console.log(userObj);

    let jsonString = JSON.stringify(userObj);
    let xhr = new XMLHttpRequest();

    xhr.open("POST", "http://localhost:8080/TrackAndRescue/postCustomerData", true);
    xhr.setRequestHeader("Content-Type", "application/json");

    xhr.send(jsonString);
}

// function sendStatus(){
//     let jsStatus = {active: status};
//     console.log(jsStatus);
//
//     let jsonString = JSON.stringify(jsStatus);
//     let xhr = new XMLHttpRequest();
//
//     xhr.open("POST", "http://localhost:8080/TrackAndRescue/postCustomerData");
//
//     xhr.send(jsStatus);
// }