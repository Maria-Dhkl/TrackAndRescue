package com.trackandrescue.dao;

import com.trackandrescue.entity.Customer;
import com.trackandrescue.entity.PoliceStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/15/20
 * Time: 7:17 PM
 */

public class PoliceStationDaoImpl implements PoliceStationDao {
   // @Autowired
    JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    
    @Override
    public void addPoliceStation(PoliceStation policeStation) {
        String sql = "INSERT INTO police_stations(police_station_name,address_x_coordinate,address_y_coordinate,user_name,password) VALUES('"+policeStation.getPoliceStationName()+"','"+policeStation.getAddressXCoordinate()+"','"+policeStation.getAddressYCoordinate()+"','"+policeStation.getUserName()+"','"+policeStation.getPassword()+"')";
        jdbcTemplate.update(sql);

    }

    @Override
    public void updatePoliceStation(PoliceStation policeStation) {
    String sql = "UPDATE police_stations SET police_station_name='"+policeStation.getPoliceStationName()+"',address_x_coordinate='"+policeStation.getAddressXCoordinate()+"',address_y_coordinate='"+policeStation.getAddressYCoordinate()+"',user_name='"+policeStation.getUserName()+"',password='"+policeStation.getPassword()+"' WHERE pid='"+policeStation.getpId()+"'";
            jdbcTemplate.update(sql);
    }

    @Override
    public int deletePoliceStationById(int pId) {
        String sql="DELETE  from police_stations where pid='"+pId+"'";
        jdbcTemplate.update(sql);
        return 1;
    }

    @Override
    public List<PoliceStation> getAllPoliceStation() {
       return jdbcTemplate.query("SELECT * FROM police_stations", new RowMapper<PoliceStation>() {
           public PoliceStation mapRow(ResultSet resultSet, int row) throws SQLException {
               PoliceStation policeStation = new PoliceStation();
               policeStation.setpId(resultSet.getInt(1));
               policeStation.setPoliceStationName(resultSet.getString(2));
               policeStation.setAddressXCoordinate(resultSet.getDouble(3));
               policeStation.setAddressYCoordinate(resultSet.getDouble(4));
               policeStation.setUserName(resultSet.getString(5));
               policeStation.setPassword(resultSet.getString(6));
               return policeStation;
           }


       });


    }

    @Override
    public PoliceStation getPoliceStationById(int pId) {
        String sql="select * from police_stations where pid=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{pId},new BeanPropertyRowMapper<PoliceStation>(PoliceStation.class));
    }

}
