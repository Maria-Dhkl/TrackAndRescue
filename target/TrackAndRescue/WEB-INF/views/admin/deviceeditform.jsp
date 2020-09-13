<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Edit Device</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg11.jpg">

<%@include file="adminHeader.jsp"%>
<div align="center">

<form:form method="post" action="/TrackAndRescue/editsavedevice">
        <table>
            <tr>
                <td>Id:</td>
                <td><form:input path="dId"/></td>
            </tr>
            <tr>
                <td>Device Name:</td>
                <td><form:input path="deviceName"/></td>
            </tr>
            <tr>
                <td>Availability:</td>
                <td><form:input path="available"/></td>
            </tr>
            <tr><td></td>
            <td><input type="submit" value="update"></td></tr>
        </table>

    </form:form>
</div>
<%@include file="../footer.jsp"%>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
