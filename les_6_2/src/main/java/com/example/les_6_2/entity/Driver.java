package com.example.les_6_2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String name;
    @Column
    String surname;

    @ManyToMany(targetEntity = Car.class, cascade = CascadeType.ALL)
    private Set<Car> cars;
}
