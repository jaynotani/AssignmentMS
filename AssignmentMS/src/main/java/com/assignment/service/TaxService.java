package com.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
	
	 public Double getCalculatedTax(Double amountEarned) {
		if(amountEarned<10000) {
			return 0d;
		} else if(amountEarned>10000 && amountEarned <20000) {
			return 0.1*amountEarned;
		} else {
			return 0.2*amountEarned;
		}
	}

}
