
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>View Police Station</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

    <script >
        setTimeout(function(){
            window.location.reload(1);
        }, 10000);
    </script>
    <meta http-equiv="refresh" content="5; URL=http://localhost:8080/TrackAndRescue/viewendfinalpolicestation">

</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg.jpg">

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
<h2>Police station id is: ${policeStationId}</h2>
<c:forEach items="${list}" var="individual_case">
<div class="container-fluid">
    <div class="box"></div>

    case id: ${individual_case.id} <br>
    policeid: ${individual_case.pid} <br>
<%--    <% String lorem = "test";--%>
<%--        System.out.println(lorem);--%>
<%--    %>--%>
    userid: ${individual_case.uid} <br>
    Active: ${individual_case.active } <br>
    x_coordinate:${individual_case.xCoordinates} <br>
    y_coordinate: ${individual_case.yCoordinates}
</div>
</div>
</c:forEach>

</div>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
