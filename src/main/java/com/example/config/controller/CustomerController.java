package com.example.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.Proxy.CustomerService;
import com.example.config.Proxy.DepartmentServiceProxy;
import com.example.config.model.DatabaseDetails;
import com.example.config.model.ServiceDetails;

@RefreshScope
@RestController
public class CustomerController {
	@Value("${app.shared.url}")
    private String jdbcUrl;
    
    @Value("${app.shared.user}")
    private String username;
    
    @Value("${app.shared.pass}")
    private String pwd;
	
	@Autowired
	private DepartmentServiceProxy dsService;
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/customer/shared")
    public DatabaseDetails getSharedAttribute() {
        return new DatabaseDetails(jdbcUrl, username, pwd);
    }
	
	@GetMapping("/customer/service")
    public ServiceDetails getCustomerServiceName() {
        return customerService.retrieveServiceDetails();
    }
	
	@GetMapping("/department/service")
    public ServiceDetails getServiceName() {
        return dsService.getServiceDetails();
    }

}
