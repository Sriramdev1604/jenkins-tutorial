package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello finally we complete jenkins setup....and i changed the file to trigger the scm by jenkins";
    }
}
