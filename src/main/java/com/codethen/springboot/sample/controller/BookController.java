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
        return
            "<html>" +
            "<head>" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/style.css\">" +
            "</head>" +
            "<body>" +
            "<h1>Recommended books</h1>" +
            "<p>Books would be displayed here.</p>" +
            "<p>See <a href='/books/1'>Book 1</a></p>" +
            "</body>" +
            "</html>";
    }

    @RequestMapping("/{id}")
    public String viewBook(@PathVariable("id") int id) {
        return "<p>Book " + id + " would be displayed here</p>";
    }
}
