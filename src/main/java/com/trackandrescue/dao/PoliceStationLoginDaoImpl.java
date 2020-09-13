package com.trackandrescue.dao;

import com.trackandrescue.entity.PoliceStation;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/6/20
 * Time: 6:30 PM
 */
public class PoliceStationLoginDaoImpl implements PoliceStationLoginDao {
    JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String isValidUser(PoliceStation policeStation) {
        try {
            String sql = "SELECT pid from police_stations WHERE user_name=? AND password=?";
            String pId = jdbcTemplate.queryForObject(sql, new Object[]{
                    policeStation.getUserName(), policeStation.getPassword()}, String.class);
            return pId;
        } catch (Exception exception) {
            return null;
        }
    }
}

