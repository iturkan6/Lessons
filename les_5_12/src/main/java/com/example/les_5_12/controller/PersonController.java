package com.example.les_5_12.controller;

import com.example.les_5_12.entity.Person;
import com.example.les_5_12.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("person")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    //    @PostMapping
//    public ResponseEntity<Integer> create(@RequestBody Person person) {
//        return new ResponseEntity<>(service.create(person), HttpStatus.CREATED);
//    }
    @PutMapping
    public ResponseEntity<Integer> process(@RequestBody Person person) {
        return new ResponseEntity<>(service.process(person), HttpStatus.OK);
    }


//
//    @PostMapping("/common")
//    public ResponseEntity<Integer> createCommon(@RequestBody Person person) {
//        return new ResponseEntity<>(service.createCommon(person), HttpStatus.CREATED);
//    }
}
