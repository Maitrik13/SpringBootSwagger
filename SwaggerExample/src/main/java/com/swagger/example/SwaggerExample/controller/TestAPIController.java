package com.swagger.example.SwaggerExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi")
public class TestAPIController {

    @GetMapping
    public String checkAPI() {
        return "Running!!!";
    }

}
