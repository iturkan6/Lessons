package com.example.les_6_2.service;

import com.example.les_6_2.entity.Driver;
import com.example.les_6_2.repository.DriverRepo;
import com.example.les_6_2.templates.RequestDriver;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DriverService {
    private final DriverRepo repo;

    public DriverService(DriverRepo repo) {
        this.repo = repo;
    }

    public Integer create(Driver driver) {
        return repo.save(driver).getId();
    }
//    public Integer createExample(RequestDriver driver) {
//        Driver db_driver = new Driver();
//        db_driver.setName(driver.name());
//        db_driver.setSurname(driver.surname());
//        db_driver.setCreateTs(LocalDateTime.now());
//    }
}
