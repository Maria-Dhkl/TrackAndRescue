package com.trackandrescue.controlles;

import com.trackandrescue.dao.DeviceDao;
import com.trackandrescue.entity.Device;
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
 * Date: 6/17/20
 * Time: 4:17 PM
 */
@Controller
public class DeviceController {
    @Autowired
    DeviceDao deviceDao;
    @RequestMapping("/adddevice")
    public String addDevice(Model model){
        model.addAttribute("command",new Device());
        return "admin/adddevice";

    }
    @RequestMapping("/savedevice")
    public String saveDevice(@ModelAttribute("device") Device device){
        deviceDao.addDevice(device);
        return "redirect:/viewdevices";
    }
    @RequestMapping("/viewdevices")
    public String viewDevice(Model model){
        List<Device> deviceList = deviceDao.getAllDevice();
        model.addAttribute("list",deviceList);
        return "admin/viewdevices";

    }
    @RequestMapping("/editdevice/{dId}")
    public String editDevice(@PathVariable int dId,Model model){
        Device device = deviceDao.getDeviceById(dId);
        model.addAttribute("command",device);
        return "admin/deviceeditform";

    }
    @RequestMapping("/editsavedevice")
    public String editSaveDevice(@ModelAttribute("device") Device device){
        deviceDao.updateDevice(device);
        return "redirect:/viewdevices";
    }


    @RequestMapping(value = "/deletedevice/{dId}",method = RequestMethod.GET)
    public String deletePoliceStation(@PathVariable int dId){
        deviceDao.deleteDevice(dId);
        return "redirect:/viewdevices";

    }
}
