package com.example.les_5_7.service;

import com.example.les_5_7.entity.Userr;
import com.example.les_5_7.repository.Repo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserrrService {

    private final Repo repo;

    public UserrrService(Repo repo) {
        this.repo = repo;
    }

    public List<Userr> getAll() {
        return repo.findAll();
    }

    public Optional<Userr> getById(int id) {
        return repo.findById(id);
    }

    public void update(Userr user) {
        Userr userr = getById(user.getId()).orElseThrow();
        userr.setName(user.getName());
        userr.setSurname(user.getSurname());
        repo.save(userr);
    }

    public int create(Userr user) {
        return repo.save(user).getId();
    }

    public void delete(Userr user) {
        repo.delete(user);
    }
}
