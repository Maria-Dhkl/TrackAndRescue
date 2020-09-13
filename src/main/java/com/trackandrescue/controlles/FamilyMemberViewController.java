package com.trackandrescue.controlles;

import com.trackandrescue.dao.UserCoordinatesDao;
import com.trackandrescue.entity.UserCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/4/20
 * Time: 4:45 PM
 */
@Controller
public class FamilyMemberViewController {
    @Autowired
    UserCoordinatesDao userCoordinatesDao;

    @RequestMapping("/FamilyMemberView/{uId}")
        public String deviceGUI(@PathVariable int uId,Model model) {

            UserCoordinates userCoordinates = userCoordinatesDao.getUserCoordinatesById(uId);
            //model.addAttribute("uid",uId);
            if (userCoordinates != null) {
                if (userCoordinates.getActive()==1) {
                    model.addAttribute("location",1);
                    model.addAttribute("usercoordinates", userCoordinates);
                    return "familymember/familymemberview";
                }else {
                    model.addAttribute("location",0);
                    model.addAttribute("inactive", "oops!! location sharing has been terminated");
                    return "familymember/familymemberview";
                }
            } else {
                model.addAttribute("hackingMsg", "oops!! Hacking attempt");
                return "security/errorpage";
            }


    }

}



