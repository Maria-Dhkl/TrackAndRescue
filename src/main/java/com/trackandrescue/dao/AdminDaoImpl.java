package com.trackandrescue.dao;

import com.trackandrescue.entity.Admin;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/6/20
 * Time: 8:54 PM
 */
public class AdminDaoImpl implements AdminDao {
    JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String isValidAdmin(Admin admin) {
       try{
           String sql = "SELECT name FROM admin WHERE user_name=? AND password=?";
           String name= jdbcTemplate.queryForObject(sql, new Object[]{
                   admin.getUserName(),admin.getPassword()
                   },String.class
                   );
           return name;

       }catch (Exception exception){
           return null;
       }
    }
}
