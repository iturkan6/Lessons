package com.example.les_6_2.controller;

import com.example.les_6_2.entity.Driver;
import com.example.les_6_2.service.DriverService;
import com.example.les_6_2.templates.RequestDriver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/driver")
public class DriverController {

   private final DriverService service;

   public DriverController(DriverService service) {
      this.service = service;
   }

   @PostMapping
    public ResponseEntity<Integer> save(@RequestBody Driver driver) {
       return ResponseEntity.ok(service.create(driver));
    }
//    @PostMapping
//    public ResponseEntity<Integer> saveExample(@RequestBody RequestDriver driver) {
//        return ResponseEntity.ok(service.createExample(driver));
//    }
}
