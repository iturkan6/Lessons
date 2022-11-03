package com.example.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    // http://localhost:8080/person/2
    @RequestMapping("person/{p_id}")
    public int handler(@PathVariable int p_id) {
        return p_id;
    }

    // http://localhost:8080/person1/2
    @RequestMapping("person1/{p_id}")
    public int handler1(@PathVariable(name = "p_id") int id) {
        return id;
    }
}
