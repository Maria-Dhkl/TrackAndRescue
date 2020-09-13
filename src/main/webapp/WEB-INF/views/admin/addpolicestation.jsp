<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add Police Station</title>
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
<div align="center">
        <form:form action="savepolicestation" method="post">
            <table>
                <tr>
                    <td>Police Station Name: </td>
                    <td><form:input path="policeStationName"/></td>
                </tr>
                <tr>
                    <td>X Coordinate</td>
                    <td><form:input path="addressXCoordinate"/></td>
                </tr>
                <tr><td>Y Coordinate</td>
                    <td><form:input path="addressYCoordinate"/></td>
                </tr>
                <tr>
                    <td>UserName:</td>
                    <td><form:input path="userName"/></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><form:password path="password"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Add"></td>
                </tr>
            </table>

        </form:form>
</div>
<div class="jumbotron text-center" style="margin-bottom:0">
    <small>&copy; Copyright 2020, Track and Rescue IOT based Project</small>
</div>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>

