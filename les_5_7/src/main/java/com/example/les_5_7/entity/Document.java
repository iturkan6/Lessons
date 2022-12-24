package com.example.les_5_7.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "d_id")
    int id;
    @Column
    String doc_name;
    @Column
    String doc_number;

    @OneToOne(mappedBy = "document")
    private Userr userr;
}
