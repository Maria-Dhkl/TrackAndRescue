package com.trackandrescue.dao;

import com.trackandrescue.entity.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/5/20
 * Time: 5:02 PM
 */
public class DeviceLoginDaoImpl implements DeviceLoginDao {
    JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String isValidUser(Customer customer) {

try {
    String sql = "SELECT id FROM customers WHERE email=? AND password=?";

    String userId = jdbcTemplate.queryForObject(sql, new Object[]{
            customer.getEmail(), customer.getPassword()}, String.class);

    return userId;

}catch (Exception exception){
    return null;
}

    }
}
