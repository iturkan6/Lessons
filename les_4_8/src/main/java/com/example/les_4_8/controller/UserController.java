package com.example.les_4_8.controller;

import com.example.les_4_8.entity.User;
import com.example.les_4_8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public User handler(@PathVariable int id) throws ClassNotFoundException {
//        if (service.getById(id).orElse().isPresent())
//            return service.getById(id).get();
//        return new User();

//        service.getById(id).orElseThrow(ClassNotFoundException::new);

        return service.getById(id).orElse(new User());
    }
}
