package com.example.les_4_8.service;

import java.util.Optional;

public interface DAO<T> {

    public Optional<T> getById(int id);

    //other methods
}
