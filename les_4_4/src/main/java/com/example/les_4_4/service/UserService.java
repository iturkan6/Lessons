package com.example.les_4_4.service;

import com.example.les_4_4.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final ArrayList<User> dataBase = new ArrayList<>();

    public List<User> getAll() {
        return dataBase;
    }

    public User getById(int id) {
        for (User user : dataBase) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void create(int id, String name, String surname, int age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setAge(age);
        dataBase.add(user);
    }

    public void delete(int id) {
        for (User user : dataBase) {
            if (user.getId() == id) {
                dataBase.remove(user);
                break;
            }
        }
    }

    public User update(int id, String name, String surname, int age) {
        for (User user : dataBase) {
            if (user.getId() == id) {
                user.setName(name);
                user.setSurname(surname);
                user.setAge(age);
                return user;
            }
        }
        return null;
    }
}
