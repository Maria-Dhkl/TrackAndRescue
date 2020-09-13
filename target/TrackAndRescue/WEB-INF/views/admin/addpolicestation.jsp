<%--
  Created by IntelliJ IDEA.
  User: abhinacharya
  Date: 6/15/20
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Police Stations</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <script src="${pageContext.request.contextPath}/resources/script/dataValidation.js"></script>
</head>
<body background="${pageContext.request.contextPath}/resources/img/bgimg11.jpg">
<%@include file="adminHeader.jsp"%>
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
<%@include file="../footer.jsp"%>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
