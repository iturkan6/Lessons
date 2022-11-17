package com.example.les_4_4.controller;

import com.example.les_4_4.entity.User;
import com.example.les_4_4.service.UserServiceWithRequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllerWithRequestBody {

    private final UserServiceWithRequestBody service;

    public UserControllerWithRequestBody(UserServiceWithRequestBody service) {
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
    public void createUser(@RequestBody User user) {
        service.create(user);

    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user) {
        service.update(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        service.delete(id);

    }

}
