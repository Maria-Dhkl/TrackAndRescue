package com.trackandrescue.controlles;

import com.trackandrescue.dao.PoliceStationLoginDao;
import com.trackandrescue.dao.UserCoordinatesDao;
import com.trackandrescue.entity.PoliceStation;
import com.trackandrescue.entity.UserCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/6/20
 * Time: 6:23 PM
 */
@Controller
public class PoliceStationLoginController {
    @Autowired
    PoliceStationLoginDao policeStationLoginDao;
    @Autowired
    UserCoordinatesDao userCoordinatesDao;
    @RequestMapping("/policestationlogin")
    public String policeStationLogin(){
        return "policestation/policestationlogin";
    }
    @RequestMapping(value = "/verifypolicestationlogin",method = RequestMethod.POST)
    public ModelAndView verifyPoliceStationLogin(@RequestParam("username")String userName,@RequestParam("password")String password){
    ModelAndView modelAndView = new ModelAndView();
        PoliceStation policeStation = new PoliceStation();
        policeStation.setUserName(userName);
        policeStation.setPassword(password);
        String pId = policeStationLoginDao.isValidUser(policeStation);
        if(pId != null){
            modelAndView.addObject("policeStationId",pId);
            List<UserCoordinates> userCoordinatesList=userCoordinatesDao.getUserCoordinates();
            modelAndView.addObject("list",userCoordinatesList);
            modelAndView.setViewName("policestation/viewendfinalpolicestation");
        }else{
            modelAndView.addObject("msg","oops!! incorrect username or password");
            modelAndView.setViewName("policestation/policestationlogin");
        }
        return modelAndView;
    }
}
