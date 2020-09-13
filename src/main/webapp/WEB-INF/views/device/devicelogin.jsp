<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Device Login</title>
        <meta charset="utf-8">  
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    </head>
    <body  background="${pageContext.request.contextPath}/resources/img/bgimg12.jpg">
<%@include file="../header.jsp"%>

    <h1 align="center">Device Login </h1>
    <form method="post" action="verifydevicelogin" >
        <table align="center">
            <tr>
                <td>Email:</td>
                <td>
                    <input type="text" name="email"/>
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
                    <input type="submit" onclick="emailValidation(email), passwordValidation(password)" name="Login">
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
    <%@include file="../footer.jsp"%>
    <script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </body>
</html>
