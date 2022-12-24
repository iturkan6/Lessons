package com.example.les_5_7.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Userr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column
    String surname;

    @OneToOne
    @JoinColumn(name = "doc_id",
            referencedColumnName = "d_id")
    private Document document;
}
