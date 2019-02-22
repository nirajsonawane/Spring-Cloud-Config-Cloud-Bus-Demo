package com.ns.microservices.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerProfileController {
	@Autowired
	private CustomerServiceConfigurations customerServiceConfigurations;
	
	@GetMapping("/customer/{email}")
	public String getCustomerDetails(@PathVariable String email) {
		System.out.println(customerServiceConfigurations.getEmailtype());
		if (email.contains(customerServiceConfigurations.getEmailtype())) {
			return "Premium  Account";
		}
		return "Free Account";
	}

}
