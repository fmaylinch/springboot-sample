package com.codethen.springboot.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to this sample app!";
    }
}
