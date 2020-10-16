
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>View Devices</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body  background="${pageContext.request.contextPath}/resources/img/backgroundview.jpg">
<%@include file="adminHeader.jsp"%>
<div align="center">
    <h1>View Devices</h1>
    <p><b>Note:Here 1 denotes that device is available</b></p>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Device Id</th>
        <th>Device Name</th>
        <th>Availability</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="device" items="${list}">
    <tr>
        <td>${device.dId}</td>
        <td>${device.deviceName}</td>
        <td>${device.available}</td>
        <td><a href="editdevice/${device.dId}">Edit</a></td>
        <td><a href="deletedevice/${device.dId}">Delete</a></td>
    </tr>
    </c:forEach>
</table>
    <p>Add new device <a href="adddevice">Click here</a></p>
<%--    <table>--%>
<%--        <tr><b>Note:Here only available device is shown</b></tr>--%>
<%--        <tr>--%>
<%--            <th>Device Id</th>--%>
<%--            <th>Device Name</th>--%>

<%--        </tr>--%>
<%--        <c:forEach var="device" items="${list}">--%>
<%--           --%>
<%--            <tr>--%>
<%--                <td>${device.dId}</td>--%>
<%--                <td>${device.deviceName}</td>--%>

<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
</div>
<%@include file="../footer.jsp"%>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>

