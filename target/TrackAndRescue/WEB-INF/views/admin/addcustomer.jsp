
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add Customer</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <script src="${pageContext.request.contextPath}/resources/script/dataValidation.js"></script>
</head>
<body  background="${pageContext.request.contextPath}/resources/img/bgimg11.jpg">
<%@include file="adminHeader.jsp"%>
    <div align="center">
        <h1>Add New Customer</h1>
        <form:form method="post" action="savecustomer">
            <table >
                <tr>
                    <td>First Name : </td>
                    <td><form:input path="firstName"  /></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><form:input path="lastName" /></td>
                </tr>
                <tr>
                    <td>Email :</td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Password :</td>
                    <td><form:password path="password" /></td>
                </tr>
                <tr>
                    <td>Personnel Mobile Number :</td>
                    <td><form:input path="personnelNumber" /></td>
                </tr>
                <tr>
                    <td>FamilyMember Name :</td>
                    <td><form:input path="familyMemberName" /></td>
                </tr>
                <tr>
                    <td>FamilyMember Mobile Number :</td>
                    <td><form:input path="familyMemberNumber" /></td>
                </tr><tr>
                    <td>Device Id :</td>
                    <td><form:input path="dId" /></td>
                </tr>

                <tr>
                    <td> </td>
                    <td><input type="submit" value="Save" /></td>
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