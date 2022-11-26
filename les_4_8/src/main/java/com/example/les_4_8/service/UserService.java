package com.example.les_4_8.service;

import com.example.les_4_8.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService implements DAO<User>{
    ArrayList<User> list = new ArrayList<>();

    @Override
    public Optional<User> getById(int id) {
        for (User user: list) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
