package com.trackandrescue.dao;

import com.trackandrescue.entity.UserCoordinates;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class testDeviceCoordinates implements UserCoordinatesDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void addUserCoordinates(UserCoordinates userCoordinates) {
        String sql = "INSERT INTO user_coordinates(uid,pid,active,x_coordinates,y_coordinates)VALUES('" + userCoordinates.getUid() + "','0','" + userCoordinates.getActive() + "','" + userCoordinates.getxCoordinates() + "','" + userCoordinates.getyCoordinates() + "')";
        template.update(sql);
    }

    @Override
    public List<UserCoordinates> getUserCoordinates() {
        return template.query("select * from user_coordinates WHERE active=1",new RowMapper<UserCoordinates>(){
            public UserCoordinates mapRow(ResultSet rs, int row) throws SQLException {
                UserCoordinates userCoordinates = new UserCoordinates();
                userCoordinates.setId(rs.getInt(1));
                userCoordinates.setUid(rs.getInt(2));
                userCoordinates.setPid(rs.getInt(3));
                userCoordinates.setActive(rs.getInt(4));
                userCoordinates.setxCoordinates(rs.getDouble(5));
                userCoordinates.setyCoordinates(rs.getDouble(6));
                return userCoordinates;
            }
        });
    }

    @Override
    public UserCoordinates getUserCoordinatesById(int uid) {
        try {
            String sql = "SELECT * from user_coordinates where uid=?";
            return template.queryForObject(sql, new Object[]{uid}, new BeanPropertyRowMapper<UserCoordinates>(UserCoordinates.class));
        }catch (Exception e){
//            System.out.println("exception vayo hae");
            return null;
        }
    }
}
