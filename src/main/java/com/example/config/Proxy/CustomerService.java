package com.example.config.Proxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.example.config.model.ServiceDetails;

@Service
@RefreshScope
public class CustomerService {
	
	@Value("${app.service-name}")
    private String serviceName;
    
    @Value("${app.host}")
    private String host;
    
    @Value("${app.env}")
    private String environment;
    
    public ServiceDetails retrieveServiceDetails() {
    	return new ServiceDetails(host, serviceName, environment);
    }

}
