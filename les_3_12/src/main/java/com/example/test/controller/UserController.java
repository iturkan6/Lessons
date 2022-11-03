package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    // http://localhost:8080/user/?id=1
    @RequestMapping("/user")
    public void handler(@RequestParam int id) {
        System.out.println(id);
    }

    // http://localhost:8080/user1/?id=1&name=tom
    @RequestMapping("/user1")
    public void handler1(@RequestParam int id, @RequestParam String name) {
        System.out.println(id);
        System.out.println(name);
    }

    // http://localhost:8080/user2/?name=tom
    @RequestMapping("/user2")
    public void handler2(@RequestParam(required = false) Optional<Integer> id, @RequestParam String name) {
        System.out.println(id);
        System.out.println(name);
    }

    // http://localhost:8080/user3/?name=tom
    @RequestMapping("/user3")
    public void handler3(@RequestParam(required = false) Optional<Integer> id, @RequestParam(name = "name") String myName) {
        System.out.println(id);
        System.out.println(myName);
    }

    // http://localhost:8080/user4/?name=tom
    @RequestMapping("/user4")
    public void handler4(@RequestParam(required = false, defaultValue = "-1") int id,
                         @RequestParam(name = "name") String myName) {
        System.out.println(id);
        System.out.println(myName);
    }

}
