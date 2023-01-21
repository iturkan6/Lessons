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

//    @JoinTable(name = "driver_car",
//            joinColumns = { @JoinColumn(
//                    name = "driver_id",
//                    referencedColumnName = "id",
//                    unique = false
//            ) },
//            inverseJoinColumns = { @JoinColumn(
//                    name = "car_id",
//                    referencedColumnName = "id",
//                    unique = false
//            ) }
//    )
}
