package com.example.les_5_12.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String reg_num;

    @Column
    String doc_num;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id")
    private Person person;
}
