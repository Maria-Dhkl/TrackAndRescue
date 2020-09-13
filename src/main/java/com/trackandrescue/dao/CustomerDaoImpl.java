package com.trackandrescue.dao;

import com.trackandrescue.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/14/20
 * Time: 7:26 PM
 */
public class CustomerDaoImpl  implements CustomerDao{

    JdbcTemplate template;
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void addCustomer(Customer customer) {
        String sql = "insert into customers(first_name,last_name,email,password,personnel_number,family_member_name,family_member_number,did) values('"+customer.getFirstName()+"','"+customer.getLastName()+"','"+customer.getEmail()+"','"+customer.getPassword()+"','"+customer.getPersonnelNumber()+"','"+customer.getFamilyMemberName()+"','"+customer.getFamilyMemberNumber()+"','"+customer.getdId()+"')";
        template.update(sql);
    }

    @Override
    public int updateCustomer(Customer customer) {
        String sql="update customers set first_name='"+customer.getFirstName()+"', last_name='"+customer.getLastName()+"',email='"+customer.getEmail()+"',password='"+customer.getPassword()+"', personnel_number='"+customer.getPersonnelNumber()+"',family_member_name='"+customer.getFamilyMemberName()+"',family_member_number='"+customer.getFamilyMemberNumber()+"',did = '"+customer.getdId()+"' WHERE id='"+customer.getcId()+"'";
        return template.update(sql);
    }

    @Override
    public int delete(int cId) {
        String sql="delete from customers where id="+cId+"";
        return template.update(sql);
    }

    @Override
    public Customer getCustomerById(int cId) {

        String sql="select * from customers where id=?";
        return template.queryForObject(sql, new Object[]{cId},new BeanPropertyRowMapper<Customer>(Customer.class));
    }

    @Override
    public List<Customer> getCustomers() {

        return template.query("select * from customers",new RowMapper<Customer>(){
            public Customer mapRow(ResultSet rs, int row) throws SQLException {
                Customer customer=new Customer();
                customer.setcId(rs.getInt(1));
                customer.setFirstName(rs.getString(2));
                customer.setLastName(rs.getString(3));
                customer.setEmail(rs.getString(4));
                customer.setPassword(rs.getString(5));
                customer.setPersonnelNumber(rs.getString(6));
                customer.setFamilyMemberName(rs.getString(7));
                customer.setFamilyMemberNumber(rs.getString(8));
                customer.setdId(rs.getInt(9));
                return customer;
            }
        });


    }
}
