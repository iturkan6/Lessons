package com.example.les_5_5.controller;

import com.example.les_5_5.entities.Person;
import com.example.les_5_5.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Person> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getById(id).orElseThrow());
    }

    @PostMapping
    public ResponseEntity<Integer> create(@RequestBody Person person) {
        return ResponseEntity.ok(service.create(person));
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Person person) {
        service.update(person);
        return new ResponseEntity<>("Updated", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        service.delete(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }
}
