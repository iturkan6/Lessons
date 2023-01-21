package com.example.les_6_2.service;

import com.example.les_6_2.entity.Driver;
import com.example.les_6_2.repository.DriverRepo;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    private final DriverRepo repo;

    public DriverService(DriverRepo repo) {
        this.repo = repo;
    }

    public Integer create(Driver driver) {
        return repo.save(driver).getId();
    }
}
