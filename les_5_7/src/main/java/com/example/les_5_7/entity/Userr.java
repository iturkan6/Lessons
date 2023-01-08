package com.example.les_5_7.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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

//    @JsonIgnore //Full ignore this field and don't show to user

    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "id") //show full entity of
                                                                                                // relational table
//    @JsonIdentityReference(alwaysAsId = true) //show only id of relational table

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "doc_id",
            referencedColumnName = "d_id")
    private Document document;
}
