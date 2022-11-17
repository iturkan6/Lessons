package com.example.les_4_4.controller;

import com.example.les_4_4.entity.User;
import com.example.les_4_4.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping("/")
    public void createUser(@RequestParam int id,
                           @RequestParam String name,
                           @RequestParam String surname,
                           @RequestParam int age) {
        service.create(id, name, surname, age);

    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id,
                           @RequestParam String name,
                           @RequestParam String surname,
                           @RequestParam int age) {
        return service.update(id, name, surname, age);

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        service.delete(id);

    }

}
