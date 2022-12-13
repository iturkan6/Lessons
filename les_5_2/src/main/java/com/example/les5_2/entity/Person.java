package com.example.les5_2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person {
    @Id
    private int id;
//    @Column(name = "name_s")
    @Column
    private String name;
}
