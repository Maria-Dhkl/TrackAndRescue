package com.trackandrescue.controlles;

import com.trackandrescue.dao.AdminDao;
import com.trackandrescue.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/6/20
 * Time: 9:06 PM
 */
@Controller
public class AdminLoginController {
    @Autowired
    AdminDao adminDao;
    @RequestMapping("/adminlogin")
    public String adminLogin(){
        return "admin/adminlogin";
    }
    @RequestMapping(value ="/verifyadminlogin",method = RequestMethod.POST)
    public ModelAndView verifyAdminLogin(@RequestParam("username")String userName,@RequestParam("password")String password){
        ModelAndView modelAndView = new ModelAndView();
        Admin admin = new Admin();
        admin.setUserName(userName);
        admin.setPassword(password);
        String name = adminDao.isValidAdmin(admin);
        if (name !=null){
            modelAndView.addObject("adminName",name);
            modelAndView.setViewName("admin/adminindex");
        }else{
            modelAndView.addObject("msg","oops!! username or password is wrong try again");
            modelAndView.setViewName("admin/adminlogin");
        }
        return modelAndView;

    }
}
