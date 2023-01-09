package com.example.les_5_10.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(unique = true, nullable = false)
    String reg_num;

    @Column
    String doc_num;

    @OneToOne(mappedBy = "document")
    Person person;
}
