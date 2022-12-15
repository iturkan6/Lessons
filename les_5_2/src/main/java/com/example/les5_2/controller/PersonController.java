package com.example.les5_2.controller;

import com.example.les5_2.entity.Person;
import com.example.les5_2.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/p")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok(service.getAllPersons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getPersonById(id).orElseThrow());
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody Person person) {
        service.savePerson(person);
        return new ResponseEntity<>("Person was created", HttpStatus.CREATED);
    }
    @PutMapping("/")
    public ResponseEntity<String> update(@RequestBody Person person) {
        service.updatePersonById(person);
        return new ResponseEntity<>("Person was updated", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.deletePersonById(id);
        return new ResponseEntity<>("Person was deleted", HttpStatus.OK);
    }
}
