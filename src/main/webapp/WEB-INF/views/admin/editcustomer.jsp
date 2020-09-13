<%--
  Created by IntelliJ IDEA.
  User: abhinacharya
  Date: 6/15/20
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit the  Customer</h1>
<form:form method="post" action="/TrackAndRescue/updatecustomer">
    <table >
        <tr>
            <td> </td>
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
