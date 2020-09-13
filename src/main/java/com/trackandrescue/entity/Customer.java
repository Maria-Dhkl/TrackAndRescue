package com.trackandrescue.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/14/20
 * Time: 7:19 PM
 */
public class Customer {
    private int cId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String personnelNumber;
    private String familyMemberName;
    private String familyMemberNumber;
    private int dId;



    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public Customer() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(String personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getFamilyMemberName() {
        return familyMemberName;
    }

    public void setFamilyMemberName(String familyMemberName) {
        this.familyMemberName = familyMemberName;
    }

    public String getFamilyMemberNumber() {
        return familyMemberNumber;
    }

    public void setFamilyMemberNumber(String familyMemberNumber) {
        this.familyMemberNumber = familyMemberNumber;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "cId=" + cId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", personnelNumber='" + personnelNumber + '\'' +
                ", familyMemberName='" + familyMemberName + '\'' +
                ", familyMemberNumber='" + familyMemberNumber + '\'' +
                ", dId=" + dId +
                '}';
    }
}
