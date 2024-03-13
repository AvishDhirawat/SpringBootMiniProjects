package com.springpractice.microservices.limitsservice.controller;

import com.springpractice.microservices.limitsservice.bean.Limits;
import com.springpractice.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration; // Using Autowired so that it will pick values from Configuration class

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return  new Limits(1,1000);
    }

}
