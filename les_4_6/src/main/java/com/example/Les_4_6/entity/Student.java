package com.example.Les_4_6.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
