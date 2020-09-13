package com.trackandrescue.dao;

import com.trackandrescue.entity.Customer;
import com.trackandrescue.entity.Device;
import com.trackandrescue.entity.PoliceStation;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/16/20
 * Time: 9:29 PM
 */
public class DeviceDaoImpl implements DeviceDao {
    JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addDevice(Device device) {
    int status= 1;
        String sql="INSERT INTO devices(device_name,available) VALUES('"+device.getDeviceName()+"','"+status+"')";
        jdbcTemplate.update(sql);
    }

    @Override
    public void updateDevice(Device device) {
        String sql ="UPDATE devices SET device_name ='"+device.getDeviceName()+"',available='"+device.getdId()+"' WHERE did= '"+device.getdId()+"' ";
        jdbcTemplate.update(sql);
    }

    @Override
    public int deleteDevice(int dId) {
        String sql = "DELETE from devices where did='"+dId+"'";
        jdbcTemplate.update(sql);

        return 1;
    }

    @Override
    public List<Device> getAllDevice() {
        return jdbcTemplate.query("SELECT * FROM devices", new RowMapper<Device>() {
            public Device mapRow(ResultSet resultSet, int row) throws SQLException {
                Device device= new Device();
            device.setdId(resultSet.getInt(1));
            device.setDeviceName(resultSet.getString(2));
            device.setAvailable(resultSet.getInt(3));
                return device;
            }


        });
    }

    @Override
    public Device getDeviceById(int dId) {

        String sql="select * from devices where did=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{dId},new BeanPropertyRowMapper<Device>(Device.class));
        }
}
