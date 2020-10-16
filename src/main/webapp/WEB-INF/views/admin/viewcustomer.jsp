
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>View Customers</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body  background="${pageContext.request.contextPath}/resources/img/backgroundview.jpg">
<%@include file="adminHeader.jsp"%>
        <div align="center">
        <h1>Customer List</h1>
        <table border="2" width="70%" cellpadding="2">
            <tr>
                <th>Id</th>
                <th>Customer Name</th>
                <th>EmailAddress</th>
                <th>PersonnelNumber</th>
        <%--        <th>Password</th>--%>
                <th>FamilyMemberName</th>
                <th>FamilyMemberNumber</th>
                <th>Device Id</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="customer" items="${list}">

                <tr>
                    <td>${customer.cId}</td>
                    <td>${customer.firstName} &nbsp; ${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <td>${customer.personnelNumber}</td>
        <%--            <td>${customer.password}</td>--%>
                    <td>${customer.familyMemberName}</td>
                    <td>${customer.familyMemberNumber}</td>
                    <td>${customer.dId}</td>
                    <td><a href="editcustomer/${customer.cId}">Edit</a></td>
                    <td><a href="deletecustomer/${customer.cId}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <a href="addCustomer">Add New Customer</a>
    </div>
<%@include file="../footer.jsp"%>
<script src="
                https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
