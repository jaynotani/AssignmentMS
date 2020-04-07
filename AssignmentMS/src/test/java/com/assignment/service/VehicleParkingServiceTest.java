package com.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assignment.entity.Vehicle;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class VehicleParkingServiceTest {
	
	@Autowired
	VehicleParkingService vehicleParkingService;
	
	// Adding vehicles to park
	@Test
	@Order(1)
	public void testParkVehicle() {
		assertTrue(this.vehicleParkingService.parkVehicle(new Vehicle("BMW")));
		assertTrue(this.vehicleParkingService.parkVehicle(new Vehicle("Ferrari")));
	}
	
	// When Pakring is full
	@Test
	@Order(2)
	public void testParkVehicleWhenParkIsFull() {
		assertFalse(this.vehicleParkingService.parkVehicle(new Vehicle("Maruti")));
	}
	
	@Test
	@Order(3)
	public void testGetVehicleParkedCount() {
		assertEquals(2, this.vehicleParkingService.getVehicleParkedCount());
	}
	
	@Test
	@Order(4)
	public void testUnParkVehicle() {
		assertTrue(this.vehicleParkingService.unParkVehicle("BMW"));
	}
	
	
	@Test
	@Order(5)
	public void testGetVehicleParkedCountAfterUnPark() {
		assertEquals(1, this.vehicleParkingService.getVehicleParkedCount());
	}
	
	
	
	
	
}
