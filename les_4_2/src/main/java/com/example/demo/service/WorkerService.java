package com.example.demo.service;

import com.example.demo.entity.Worker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerService {
    private final ArrayList<Worker> workers = new ArrayList<>();

    public List<Worker> getWorkers() {
        return workers;
    }
}
