package com.example.les_4_4.service;

import com.example.les_4_4.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceWithRequestBody {
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

    public void create(User user) {
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

    public User update(User user, int id) {
        for (User el : dataBase) {
            if (el.getId() == id) {
                el.setName(user.getName());
                el.setSurname(user.getSurname());
                el.setAge(user.getAge());
                return el;
            }
        }
        return null;
    }
}
