
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Edit Customers</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg11.jpg">
<%@include file="adminHeader.jsp"%>
<div align="center">
        <h1>Edit the  Customers</h1>
        <form:form method="post" action="/TrackAndRescue/updatecustomer">
            <table >
        <%--        <tr>--%>
        <%--            <td> </td>--%>
        <%--            <td><form:input path="cId"/></td>--%>
        <%--&lt;%&ndash;            <td><input type="text" name="cId" id="cId"></td>&ndash;%&gt;--%>
        <%--        </tr>--%>
            <tr>
                <td>Id</td>
                <td><form:input path="cId"/></td>
            </tr>
                <tr>
                    <td>FirstName:</td>
                    <td><form:input path="firstName"  /></td>
                </tr>
                <tr>
                    <td>LastName:</td>
                    <td><form:input path="lastName" /></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:input path="password" /></td>
                </tr>
                <tr>
                    <td>PersonnelNumber:</td>
                    <td><form:input path="personnelNumber" /></td>
                </tr>
                <tr>
                    <td>FamilyMemberName</td>
                    <td><form:input path="familyMemberName" /></td>
                </tr>
                <tr>
                    <td>FamilyMemberName</td>
                    <td><form:input path="familyMemberNumber" /></td>
                </tr>
                <tr>
                    <td>Device Id</td>
                    <td><form:input path="dId" /></td>
                </tr>

                <tr>
                    <td> </td>
                    <td><input type="submit" value="update" /></td>
                </tr>
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
