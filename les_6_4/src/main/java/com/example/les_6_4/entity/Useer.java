package com.example.les_6_4.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Useer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(unique = true)
    String username;

    @Column
    String password;

    @Column
    String name;
}
