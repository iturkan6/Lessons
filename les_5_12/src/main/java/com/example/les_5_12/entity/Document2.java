package com.example.les_5_12.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Document2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String reg_num;

    @Column
    String doc_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "person_document",
    joinColumns = {
            @JoinColumn(name = "document_id", referencedColumnName = "id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "person_id", referencedColumnName = "id")
    })
    private Person person;
}
