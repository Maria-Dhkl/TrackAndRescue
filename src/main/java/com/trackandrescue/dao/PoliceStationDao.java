package com.trackandrescue.dao;

import com.trackandrescue.entity.Customer;
import com.trackandrescue.entity.PoliceStation;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/15/20
 * Time: 7:10 PM
 */
public interface PoliceStationDao {
    public void addPoliceStation(PoliceStation policeStation);
    public void updatePoliceStation(PoliceStation policeStation);
    public int deletePoliceStationById(int pId );
    public List<PoliceStation> getAllPoliceStation();
    public PoliceStation getPoliceStationById(int pId);

}
