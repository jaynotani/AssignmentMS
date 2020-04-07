package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.entity.Vehicle;
import com.assignment.service.VehicleParkingService;

@RestController
@RequestMapping("/parking")
public class VehicleParkingController {

	@Autowired
	VehicleParkingService vehicleParkingService;
	
	@RequestMapping(value="/parkVehicle")
	public boolean parkVehicle(@RequestBody Vehicle vehicle) {
		return this.vehicleParkingService.parkVehicle(vehicle);
	}
	
	@RequestMapping("/getVehicleParkedCount")
	public Integer getVehicleParkedCount() {
		return this.vehicleParkingService.getVehicleParkedCount();
	}
	
	@RequestMapping("/unParkVehicle/{vehicleName}")
	public boolean unParkVehicle(@PathVariable("vehicleName") String vehicleName) {
		return this.vehicleParkingService.unParkVehicle(vehicleName);
	}
	
	@RequestMapping("/getAllParkedVehicles")
	public List<Vehicle> getAllParkedVehicles(){
		return this.vehicleParkingService.getAllParkedVehicles();
	}
	
}
