package com.trackandrescue.dao;

import com.trackandrescue.entity.Customer;
import com.trackandrescue.entity.PoliceStation;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/6/20
 * Time: 6:29 PM
 */
public interface PoliceStationLoginDao {
    public String isValidUser(PoliceStation policeStation);
}
