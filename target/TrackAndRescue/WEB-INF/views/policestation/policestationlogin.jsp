
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Police Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg.jpg">

<%@include file="../header.jsp"%>
<h1 align="center">Police Login </h1>

<form method="post" action="verifypolicestationlogin">
    <table align="center">
        <tr>
            <td>UserName:</td>
            <td>
                <input type="text" name="username" required>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>
                <input type="password" name="password"required>
            </td>
        </tr>
        <tr>
            <td></td>
        </tr>
        <tr>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" name="Login">
                <input type="reset" name="Clear">
            </td>
            <td>

            </td>
        </tr>
        <tr>
            <td colspan="2">${msg}</td>
        </tr>
    </table>
</form>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
