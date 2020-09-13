package com.trackandrescue.controlles;

import com.trackandrescue.dao.UserCoordinatesDao;

import com.trackandrescue.entity.UserCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/21/20
 * Time: 6:05 PM
 */
//yo controller hatauda hunxa,yesko aarko ma add gareko xu maile
@Controller
public class UserCoordinatesController {
    @Autowired
    UserCoordinatesDao userCoordinatesDao;

    @RequestMapping("/viewendfinalpolicestation")
    public String viewEndFinalPoliceStation(Model model){
        List<UserCoordinates> userCoordinatesList=userCoordinatesDao.getUserCoordinates();
        model.addAttribute("list",userCoordinatesList);
        return "policestation/viewendfinalpolicestation";
    }
}
