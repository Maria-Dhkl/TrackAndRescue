<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Admin Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <script src="${pageContext.request.contextPath}/resources/script/dataValidation.js"></script>
</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg11.jpg">
<%@include file="../header.jsp"%>

<h1 align="center">Admin Login Panel</h1>

<form method="post" action="verifyadminlogin">
    <table align="center">
        <tr>
            <td>UserName:</td>
            <td>
                <input type="text" name="username"/>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>
                <input type="password" name="password"/>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" name="Login">
                <input type="reset" name="Clear">
            </td>

        </tr>
        <tr>
            <td colspan="2">${msg}</td>
        </tr>
    </table>
</form>
<%@include file="../footer.jsp"%>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
