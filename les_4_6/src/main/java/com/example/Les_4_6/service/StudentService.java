package com.example.Les_4_6.service;

import com.example.Les_4_6.entity.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class StudentService {
    private final ArrayList<Student> students = new ArrayList<>();

    private void addInfo() {
        log.info("Creating users");
        Student student = new Student();
        student.setId(1);
        student.setName("Tom");
        log.info("Created user with id {}", student.getId());

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("Mary");
        log.info("Created user with id {}", student1.getId());

        students.add(student);
        students.add(student1);

        log.error("Something went wrong");
        log.warn("user must be with defining name");
    }

    public List<Student> getAll() {
        addInfo();
        System.out.println(students.toString());
        return students;
    }
}
