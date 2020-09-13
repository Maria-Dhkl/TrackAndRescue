package com.trackandrescue.dao;

import com.trackandrescue.entity.Customer;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/5/20
 * Time: 5:00 PM
 */
public interface DeviceLoginDao {
    public String isValidUser(Customer customer);
}
