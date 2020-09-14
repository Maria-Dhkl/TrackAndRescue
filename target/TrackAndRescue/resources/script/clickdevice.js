let count = 0;
let form = document.getElementById("clickHome");
let countButton = document.getElementById("counter");
let displayOutput = document.getElementById("output");
let resetCount;
let timer;
let status = 0;

getLocation();
setTimeout(function(){getLocation.reload(1);}, 10000);

function countFunction(){
    count++;
    if(count==1) {
        timeOut(30000);
        document.getElementById("active").value = status.toString();
    }

    else if (count > 1 && count < 4){
        clearTimeout(resetCount);
        status = 1;
        document.getElementById("active").value = status.toString();
        document.getElementById("noOfClick").value = count.toString();
        form.onsubmit = function() {
            if (count==2){
                return true;
            }
            else if (count==3){
                return true;
            }
        }
    }

    else if(count>3) {
        status = 0;
        document.getElementById("active").value = status.toString();
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
    document.getElementById("yCoordinates").value = latitude.toString();
    longitude = position.coords.longitude;
    document.getElementById("xCoordinates").value = longitude.toString();
}
