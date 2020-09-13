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
<%@include file="../header.jsp"%>
<div align="center">
        <form action="savepolicestation" method="post">
            <table>
                <tr>
                    <td>Police Station Name: </td>
                    <td><input type="text" name="policeStationName" required></td>
                </tr>
                <tr>
                    <td>X Coordinate</td>
                    <td><input type="text" name="addressXCoordinate" required></td>
                </tr>
                <tr><td>Y Coordinate</td>
                    <td><input type="text" name="addressYCoordinate" required></td>
                </tr>
                <tr>
                    <td>UserName:</td>
                    <td><input type="text" name="userName" required></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" path="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Add"></td>
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

