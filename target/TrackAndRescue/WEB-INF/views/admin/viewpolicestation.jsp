
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
<%@include file="../header.jsp"%>
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
<%@include file="../footer.jsp"%>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
