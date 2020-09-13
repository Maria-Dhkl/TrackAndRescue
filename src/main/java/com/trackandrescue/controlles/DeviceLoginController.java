package com.trackandrescue.controlles;

import com.trackandrescue.dao.DeviceLoginDao;
import com.trackandrescue.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/5/20
 * Time: 4:38 PM
 */
@Controller
public class DeviceLoginController {
    @Autowired
    DeviceLoginDao deviceLoginDao;

    @RequestMapping("/devicelogin")
    public String deviceLogin() {
        return "device/devicelogin";
    }
//    @RequestMapping("/devicelandingpage")
//    public String deviceLandingPage() {
//        return "device/devicelandingpage";
//    }

    @RequestMapping(value = "/verifydevicelogin", method = RequestMethod.POST)
    public ModelAndView verifyDeviceLogin(@RequestParam("email") String email, @RequestParam("password") String password) {

        ModelAndView modelAndView = new ModelAndView();
        Customer customer = new Customer();
        customer.setEmail(email);
        customer.setPassword(password);
        String userId = deviceLoginDao.isValidUser(customer);


        //       int isValid = deviceLoginDao.isValidUser(email, password);
        if (userId !=null) {
            modelAndView.addObject("userId", userId);
            modelAndView.setViewName("device/addusercoordinates");

        } else {
            modelAndView.addObject("msg", "oops!! invalid email or password.");
            modelAndView.setViewName("device/devicelogin");
        }
        return modelAndView;


    }
}
