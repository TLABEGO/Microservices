package com.microservices.limitesservice.controller;

import com.microservices.limitesservice.config.Configuration;
import com.microservices.limitesservice.model.Limits;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final Configuration configuration;

    @GetMapping("/limits")
    public Limits test(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
