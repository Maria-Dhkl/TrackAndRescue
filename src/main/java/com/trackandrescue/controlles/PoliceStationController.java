package com.trackandrescue.controlles;

import com.trackandrescue.dao.PoliceStationDao;
import com.trackandrescue.entity.PoliceStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/15/20
 * Time: 7:22 PM
 */
@Controller
public class PoliceStationController {
    @Autowired
    PoliceStationDao policeStationDao;

    @RequestMapping("/addPoliceStation")
    public String addPoliceStation(Model model){
       model.addAttribute("command",new PoliceStation());
        return "admin/addpolicestation";
    }
  @RequestMapping("/savepolicestation")
    public String savePoliceStation(@ModelAttribute("policestation") PoliceStation policeStation){
        policeStationDao.addPoliceStation(policeStation);
        return "redirect:/viewpolicestation";
  }
@RequestMapping("/viewpolicestation")
    public String viewPoliceStation(Model model){
    List<PoliceStation> policeStationList = policeStationDao.getAllPoliceStation();
        model.addAttribute("list",policeStationList);
        return "admin/viewpolicestation";

}
@RequestMapping(value = "/editpolicestation/{pId}")
public String editPoliceStation(@PathVariable int pId ,Model model){
        PoliceStation policeStation = policeStationDao.getPoliceStationById(pId);
        model.addAttribute("command",policeStation);
        return "admin/policestationeditform";
}
@RequestMapping(value = "/policestationeditsave",method = RequestMethod.POST)
    public String policestationeditsave(@ModelAttribute("policestation" )PoliceStation policeStation){
        policeStationDao.updatePoliceStation(policeStation);
        return "redirect:/viewpolicestation";

}
@RequestMapping(value = "/deletepolicestation/{pId}",method = RequestMethod.GET)
    public String deletePoliceStation(@PathVariable int pId){
        policeStationDao.deletePoliceStationById(pId);
        return "redirect:/viewpolicestation";

}
}
