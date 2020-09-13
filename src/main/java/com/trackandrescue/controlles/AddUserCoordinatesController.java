package com.trackandrescue.controlles;
import com.trackandrescue.dao.UserCoordinatesDao;
import com.trackandrescue.dao.UserCoordinatesDaoImpl;
import com.trackandrescue.entity.UserCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/13/20
 * Time: 12:02 PM
 */
@Controller
public class AddUserCoordinatesController {
    @Autowired
    UserCoordinatesDaoImpl userCoordinatesDaoImpl;
    @RequestMapping("/addusercoordinates")
    public String addUserCoordinates(Model model) {
        model.addAttribute("command", new UserCoordinates());
        return "device/addusercoordinates";
    }
    @PostMapping(value = "/postCustomerData")
    public String postCustomerData(@ModelAttribute UserCoordinates userCoordinates) {
        userCoordinatesDaoImpl.addUserCoordinates(userCoordinates);
        return "device/addusercoordinates";
    }
}