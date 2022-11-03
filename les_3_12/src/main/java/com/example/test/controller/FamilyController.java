package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
@RequestMapping("/family")
public class FamilyController {

    // http://localhost:8080/family
    @RequestMapping("/")
    public void handlerr(@RequestParam int id) {
        System.out.println(id);
    }

    // http://localhost:8080/family/mother
    @RequestMapping("/mother")
    public void handler(@RequestParam int id) {
        System.out.println(id);
    }

    // http://localhost:8080/family/father
    @RequestMapping("/father")
    public void handler1(@RequestParam int id, @RequestParam String name) {
        System.out.println(id);
        System.out.println(name);
    }

    // http://localhost:8080/family/children
    @RequestMapping("/children")
    public void handler2(@RequestParam(required = false) Optional<Integer> id, @RequestParam String name) {
        System.out.println(id);
        System.out.println(name);
    }
}
