package com.trackandrescue.dao;

import com.trackandrescue.entity.Device;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/16/20
 * Time: 9:11 PM
 */
public interface DeviceDao {
    public void addDevice(Device device);
    public void updateDevice(Device device);
    public int deleteDevice(int dId);
    public List<Device> getAllDevice();
    public Device getDeviceById(int dId);
}
