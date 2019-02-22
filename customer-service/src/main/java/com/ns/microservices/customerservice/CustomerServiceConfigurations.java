package com.ns.microservices.customerservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("customer-service")
@Data
@RefreshScope
public class CustomerServiceConfigurations {
	
	private String emailtype;

}
