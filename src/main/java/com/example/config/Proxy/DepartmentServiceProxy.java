package com.example.config.Proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.config.model.ServiceDetails;


@FeignClient(name="department-service")
public interface DepartmentServiceProxy {

    @GetMapping("/service")
    public ServiceDetails getServiceDetails();
}
