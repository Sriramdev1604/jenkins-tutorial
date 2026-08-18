package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello this is java spring boot application done by jenkins session";
    }
}
