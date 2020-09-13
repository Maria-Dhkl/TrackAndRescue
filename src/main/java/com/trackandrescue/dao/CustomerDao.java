package com.trackandrescue.dao;


import com.trackandrescue.entity.Customer;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/14/20
 * Time: 7:26 PM
 */
public interface CustomerDao {
   public void addCustomer(Customer customer);
   public int updateCustomer(Customer customer);
   public int delete(int cId);
   public Customer getCustomerById(int cId);
   public List<Customer> getCustomers();
}
