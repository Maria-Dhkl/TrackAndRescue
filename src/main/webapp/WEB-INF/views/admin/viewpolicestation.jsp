
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>View Police Station</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg11.jpg">

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="${pageContext.request.contextPath}/resources/img/logo1.png"  class="rounded-circle" alt="Responsive image">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>

        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8080/TrackAndRescue/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addCustomer">AddCustomer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewcustomer">ViewCustomer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addPoliceStation">AddPoliceStation</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewpolicestation">ViewPoliceStation</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="adddevice">AddDevice</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewdevices">viewDevice</a>
                </li>


            </ul>
        </div>
    </div>
</nav>
<table align="center">
    <tr>
        <th>ID</th>
        <th>PoliceStationName</th>
        <th>X-Coordinate</th>
        <th>Y-Coordinate</th>
        <th>UserName</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="policestation" items="${list}">
    <tr>
        <td>${policestation.pId}</td>
        <td>${policestation.policeStationName}</td>
        <td>${policestation.addressXCoordinate}</td>
        <td>${policestation.addressYCoordinate}</td>
        <td>${policestation.userName}</td>
        <td><a href="editpolicestation/${policestation.pId}">Edit</a></td>
        <td><a href="deletepolicestation/${policestation.pId}">Delete</a></td>
        </c:forEach>
    </tr>
</table>
<div class="jumbotron text-center" style="margin-bottom:0">
    <small>&copy; Copyright 2020, Track and Rescue IOT based Project</small>
</div>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
