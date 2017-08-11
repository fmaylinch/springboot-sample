package com.codethen.springboot.sample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books", produces = MediaType.TEXT_HTML_VALUE)
public class BookController {

    @RequestMapping
    public String viewBooks() {
        return "<p>Books would be displayed here.</p>" +
            "<p>See <a href='/books/1'>Book 1</a></p>";
    }

    @RequestMapping("/{id}")
    public String viewBook(@PathVariable("id") int id) {
        return "<p>Book " + id + " would be displayed here</p>";
    }
}
