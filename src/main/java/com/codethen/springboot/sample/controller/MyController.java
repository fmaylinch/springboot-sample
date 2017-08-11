package com.codethen.springboot.sample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.TEXT_HTML_VALUE)
public class MyController {

    @RequestMapping("/")
    public String index() {
        return "<p>Welcome to this sample app!</p>" +
            "<p><a href='/books'>See page for books</a></p>";
    }
}
