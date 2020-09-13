package com.trackandrescue.entity;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/16/20
 * Time: 9:09 PM
 */
public class Device {
    private int dId;
    private String deviceName;
    private int available;

    public Device() {
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Device{" +
                "dId=" + dId +
                ", deviceName='" + deviceName + '\'' +
                ", quantity=" + available +
                '}';
    }
}
