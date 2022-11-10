package com.example.demo.controller;

import com.example.demo.entity.Worker;
import com.example.demo.service.WorkerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class TestController {
    private final WorkerService service;

    public TestController(WorkerService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public List<Worker> getWorkers() {
        return service.getWorkers();
    }
    @GetMapping("/{id}")
    public List<Worker> getWorkers1() {
        return service.getWorkers();
    }
//    @PostMapping("/")
//    @PutMapping
//    @DeleteMapping
}
