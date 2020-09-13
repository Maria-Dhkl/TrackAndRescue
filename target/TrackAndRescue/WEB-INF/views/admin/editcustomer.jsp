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
<form method="post" action="/TrackAndRescue/updatecustomer">
    <table >
        <tr>
            <td> </td>
            <td><input type="number" name="cId"></td>
        </tr>

        <tr>
            <td>First Name : </td>
            <td><input type="text" name="firstName" required></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><input type="text" name="lastName" required></td>
        </tr>
        <tr>
            <td>Email :</td>
            <td><input type="email" name="email" pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$" title="Must be in the format abc@xyz.def" required></td>
        </tr>
        <tr>
            <td>Password :</td>
            <td><input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required></td>
        </tr>
        <tr>
            <td>Personnel Mobile Number :</td>
            <td><input type="text" name="personnelNumber" pattern="^\d{10}$" title="Must be 10 digits" required></td>
        </tr>
        <tr>
            <td>FamilyMember Name :</td>
            <td><input type="text" name="familyMemberName" required></td>
        </tr>
        <tr>
            <td>FamilyMember Mobile Number :</td>
            <td><input type="text" name="familyMemberNumber" pattern="^\d{10}$" title="Must be 10 digits" required></td>
        </tr><tr>
        <tr>
            <td>Device Id</td>
            <td><input type="number" name="dId" required></td>
        </tr>

        <tr>
            <td> </td>
            <td><input type="submit" value="update" /></td>
        </tr>
    </table>
</form>
