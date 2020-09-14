<%--
  Created by IntelliJ IDEA.
  User: Maria Dhakal
  Date: 9/14/2020
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Location of user</title>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" />
    <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"></script>
    <script >
        setTimeout(function(){
            window.location.reload(1);
        }, 10000);
    </script>
    <style type="text/css">
        #map{
            height: 800px;
            width: auto;
        }
    </style>
</head>
<body>
<div id="map"></div>
<%@include file="../footer.jsp"%>
<script>
    function getCoordinates(coordinateName){
        let coordinates = new URLSearchParams(window.location.search);
        return coordinates.get(coordinateName);
    }

    let longitude = getCoordinates("longitude");
    let latitude = getCoordinates("latitude");

    let map = L.map('map').setView([longitude,latitude], 30);
    L.tileLayer('https://api.maptiler.com/maps/streets/{z}/{x}/{y}.png?key=gRfDOw9mrfxrXq2cRfWt',{
        attribution: '<a href="https://www.maptiler.com/copyright/" target="_blank">&copy; MapTiler</a> <a href="https://www.openstreetmap.org/copyright" target="_blank">&copy; OpenStreetMap contributors</a>'
    }).addTo(map);

    let marker = L.marker([longitude, latitude]).addTo(map);
</script>
</body>
</html>
