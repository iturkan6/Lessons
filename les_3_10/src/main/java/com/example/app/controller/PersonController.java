package com.example.app.controller;

import com.example.app.entity.Person;
import com.example.app.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @RequestMapping("/p1")
    public Person handler1() {
        return service.person1();
    }

    @RequestMapping("/p2")
    public Person handler2() {
        return service.person2();
    }

    @RequestMapping("/p3")
    public Person handler3() {
        return service.person3();
    }
}
