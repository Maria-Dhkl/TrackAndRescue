
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add Device</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg11.jpg">

<%@include file="adminHeader.jsp"%>
<div align="center">
    <h1>Add New Device</h1>
    <form action="savedevice">
        <table>
            <tr>
                <td>Device Name</td>
                <td><input type="text" name="deviceName" required></td>
            </tr>
         <tr>
             <td></td>
             <td><input type="submit" value="add"></td>
         </tr>
        </table>
    </form>
    </div>
<%@include file="../footer.jsp"%>
    <script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
