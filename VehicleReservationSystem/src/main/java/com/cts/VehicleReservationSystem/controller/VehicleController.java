package com.cts.VehicleReservationSystem.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.cts.VehicleReservationSystem.bean.Vehicle;
import com.cts.VehicleReservationSystem.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	
	@RequestMapping(value="update.html")                //GetMapping(value="login.html", method= RequestMethod.GET) could also be done
	public ModelAndView getUpdatePage(){
		//System.out.println(vehicle);
		ModelAndView modelAndView = new ModelAndView();
//		System.out.println(vehicleService.getallVehicle());
//		System.out.println("update");
		modelAndView.addObject("vehicle", vehicleService.getallVehicle());
		modelAndView.setViewName("update");
		return modelAndView;
	}
	@RequestMapping(value="addVehicles.html")                //GetMapping(value="login.html", method= RequestMethod.GET) could also be done
	public String getaddVehiclePage(){
		return "addVehicle";
	}
	@RequestMapping(value="addVehicle.html", method=RequestMethod.POST)
	public ModelAndView addVehicle(@ModelAttribute Vehicle vehicle){
//	System.out.println(vehicle);
		ModelAndView modelAndView=new ModelAndView();
		vehicleService.insertVehicle(vehicle);
		modelAndView.setViewName("home");
//		System.out.println("In controller" + vehicle);

		return modelAndView;
}
	@RequestMapping(value="search.html", method= RequestMethod.POST)
	public ModelAndView searchMedicine(@RequestParam("criteria") String search_by,@RequestParam("Value") String search_value){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(search_by);
		System.out.println(search_value);
			List<Vehicle> vehicles= vehicleService.searchVehicleByValues(search_by, search_value);
			System.out.println(vehicles);
			modelAndView.addObject("vehicles", vehicles);
			modelAndView.setViewName("home");
			return modelAndView;
	
	}
	
	@RequestMapping(value="updateVehicle.html")
	public ModelAndView updatePage(@ModelAttribute Vehicle vehicle, @RequestParam("id") String vehicleNumber){
//	System.out.println(vehicle);
		ModelAndView modelAndView=new ModelAndView();
		System.out.println("In Mapping");
		System.out.println(vehicleNumber);
	    Vehicle vehicle2 = vehicleService.sendVehicle(vehicleNumber);
	    modelAndView.addObject("vehicle", vehicle2);
		modelAndView.setViewName("updateVehicle");
//		System.out.println("In controller" + vehicle);
		return modelAndView;
}
	
	@RequestMapping(value="updateVehicle1.html", method= RequestMethod.POST)
	public ModelAndView updateVehicle(@ModelAttribute Vehicle vehicle){
//	System.out.println(vehicle);
		ModelAndView modelAndView=new ModelAndView();
		System.out.println("In Mapping");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		vehicleService.updateVehicle(vehicle);
		modelAndView.addObject("vehicle", vehicleService.getallVehicle());
		modelAndView.setViewName("update");
//		System.out.println("In controller" + vehicle);
		return modelAndView;
}
}