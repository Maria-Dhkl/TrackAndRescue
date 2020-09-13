package com.trackandrescue.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/14/20
 * Time: 7:13 PM
 */
@Controller

public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

}
