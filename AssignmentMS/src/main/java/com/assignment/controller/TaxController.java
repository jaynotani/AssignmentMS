package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.service.TaxService;

@RestController
@RequestMapping("/tax")
public class TaxController {

	@Autowired
	TaxService taxService;
	
	@RequestMapping("/getCalculatedTax/{amountEarned}")
	public Double getCalculatedTax(@PathVariable("amountEarned") Double amountEarned) {
		return this.taxService.getCalculatedTax(amountEarned);
	}
}
