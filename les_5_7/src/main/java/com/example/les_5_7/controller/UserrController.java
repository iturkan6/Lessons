package com.example.les_5_7.controller;

import com.example.les_5_7.entity.Userr;
import com.example.les_5_7.service.UserrrService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserrController {

    private final UserrrService service;

    public UserrController(UserrrService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Userr> getById(@PathVariable int id){
        return ResponseEntity.ok(service.getById(id).orElseThrow());
    }

    @GetMapping
    public ResponseEntity<List<Userr>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Integer> create(Userr user) {
        return ResponseEntity.ok(service.create(user));
    }
}
