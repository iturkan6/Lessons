package com.example.les_5_10.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;

    @Column
    String surname;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "person_document",
    joinColumns =
            {@JoinColumn(name = "person_id", referencedColumnName = "id", unique = true)},
    inverseJoinColumns =
            {@JoinColumn(name = "document_id", referencedColumnName = "id", unique = true)})
    Document document;

}
