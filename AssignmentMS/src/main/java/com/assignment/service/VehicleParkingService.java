package com.assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.entity.Vehicle;

@Service
public class VehicleParkingService {

	private Integer parkingCount=0;
	private Integer totalParkingSpaces=5;
	private List<Vehicle> parkedList = new ArrayList<Vehicle>();
	
	// Method to add the vehicle into parking
	public boolean parkVehicle(Vehicle vehicle) {
		if(this.parkingCount < this.totalParkingSpaces) {
			this.parkedList.add(vehicle);
			this.parkingCount++;
			return true;
		}else {
			return false;
		}
	}

	// Method to get the parking count
	public Integer getVehicleParkedCount() {
		return this.parkingCount;
	}
	
	// Method to remove vehicle from parking
	public boolean unParkVehicle(String vehicleName) {
		List<Vehicle> parkedVehicleList = getAllParkedVehicles();
		for(Vehicle vehicleObj : parkedVehicleList) {
			if(vehicleObj.getName().equals(vehicleName)) {
				parkedVehicleList.remove(vehicleObj);
				this.parkingCount--;
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	// Method to get All Parked vehicles
	public List<Vehicle> getAllParkedVehicles(){
		return this.parkedList;
	}
}
