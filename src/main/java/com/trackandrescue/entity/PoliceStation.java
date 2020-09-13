package com.trackandrescue.entity;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/15/20
 * Time: 7:05 PM
 */
public class PoliceStation {
    private int pId;
    private String policeStationName;
    private double addressXCoordinate;
    private double addressYCoordinate;
    private String userName;
    private String password;
    public PoliceStation() {
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getPoliceStationName() {
        return policeStationName;
    }

    public void setPoliceStationName(String policeStationName) {
        this.policeStationName = policeStationName;
    }

    public double getAddressXCoordinate() {
        return addressXCoordinate;
    }

    public void setAddressXCoordinate(double addressXCoordinate) {
        this.addressXCoordinate = addressXCoordinate;
    }

    public double getAddressYCoordinate() {
        return addressYCoordinate;
    }

    public void setAddressYCoordinate(double addressYCoordinate) {
        this.addressYCoordinate = addressYCoordinate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PoliceStation{" +
                "pId=" + pId +
                ", policeStationName='" + policeStationName + '\'' +
                ", addressXCoordinate=" + addressXCoordinate +
                ", addressYCoordinate=" + addressYCoordinate +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
