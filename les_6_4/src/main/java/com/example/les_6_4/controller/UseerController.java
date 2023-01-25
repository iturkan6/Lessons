package com.example.les_6_4.controller;

import com.example.les_6_4.dto.UseerLogin;
import com.example.les_6_4.dto.UseerRequest;
import com.example.les_6_4.service.UseerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/useer")
public class UseerController {

    private final UseerService service;

    public UseerController(UseerService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<Integer> registration(@RequestBody UseerRequest request) {
        return ResponseEntity.ok(service.registration(request));
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody UseerLogin useerLogin) {
        Integer userId = service.login(useerLogin);
        return userId == null ? new ResponseEntity<>("Username or password is wrong", HttpStatus.UNAUTHORIZED) : ResponseEntity.ok(userId);
    }
}
