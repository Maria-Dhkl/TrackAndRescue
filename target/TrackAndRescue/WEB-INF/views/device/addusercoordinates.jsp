<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add User Coordinates</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <script src="${pageContext.request.contextPath}/resources/script/clickdevice.js"></script>
</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg12.jpg">

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
                    <a class="nav-link" href="adminlogin">Admin LogIn</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="devicelogin">Device LogIn</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="policestationlogin">PoliceStation LogIn</a>
                </li>

            </ul>
        </div>
</nav>

<div align="center">
<form id="clickHome" method="post" action="postCustomerData">
<%--    DID: <input  type="text" name="dId"><br>--%>
    UID: <input type="text " name="uid" value="${userId}"><br>
<%--    PID: <input type="text " name="pid"><br>--%>
    <input id="xCoordinates" type="hidden" name="xCoordinates" value=""><br>
    <input id="yCoordinates" type="hidden" name="yCoordinates" value=""><br>
    <input id="active" type="hidden" name="active" value=""><br>
    <input id="noOfClick" type="hidden" name="noOfClick" value=""><br>

    <input type="button" id="counter" name="button" onclick="countFunction()" value="Click">
    <input type="submit" id="submit" >
    <p id = "output"></p>
</form>
</div>
<%@include file="../footer.jsp"%>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>

