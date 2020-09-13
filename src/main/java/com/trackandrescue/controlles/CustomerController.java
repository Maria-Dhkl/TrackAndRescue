package com.trackandrescue.controlles;

import com.trackandrescue.dao.CustomerDao;
import com.trackandrescue.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/15/20
 * Time: 1:41 PM
 */
@Controller
public class CustomerController {
    @Autowired
    CustomerDao customerDao;

    @RequestMapping("/viewcustomer")
    public String viewCustomer(Model model){
        List<Customer> list=customerDao.getCustomers();
        model.addAttribute("list",list);
        return "admin/viewcustomer";
    }

    /* It provides list of employees in model object */
    /*Yesle customer addCustomer garne form dekhauxa, here "command" is a reserved request attribute
     *which is used to display object data into form
     */
    @RequestMapping("/addCustomer")
    public String addCustomer(Model model){
        model.addAttribute("command",new Customer());
        return "admin/addcustomer";

    }
    /*It saves object into database. The @ModelAttribute puts request data
     *  into model object. yesma RequestMethod.POST method lekhnu parxa
     *  because default request is GET*/
    @RequestMapping("/savecustomer")
    public String save(@ModelAttribute("customer") Customer customer){
        customerDao.addCustomer(customer);
        return "redirect:/viewcustomer";//viewcustomer ma redirect garxa
    }
    /* It displays object data into form for the given id.
     * The @PathVariable puts URL data into variable.*/
    @RequestMapping("/editcustomer/{cId}")
    public String editCustomer(@PathVariable int cId, Model model){
        Customer customer=customerDao.getCustomerById(cId);
        model.addAttribute("command",customer);
        return "admin/editcustomers";
    }

    /* yele employee ko model object lai update garxa. */
    @RequestMapping(value="/updatecustomer",method = RequestMethod.POST)
    public String updateCustomer(@ModelAttribute("customer") Customer customer){
        customerDao.updateCustomer(customer);
        return "redirect:/viewcustomer";
    }
    /* It deletes record for the given id in URL and redirects to /viewemp */
    @RequestMapping(value="/deletecustomer/{cId}",method = RequestMethod.GET)
    public String delete(@PathVariable int cId){
        customerDao.delete(cId);
        return "redirect:/viewcustomer";
    }
}
