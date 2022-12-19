package com.example.les_5_5.service;

import com.example.les_5_5.entities.Person;
import com.example.les_5_5.repository.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepo repo;

    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }

    public List<Person> getAll() {
        return repo.findAll();
    }

    public Optional<Person> getById(int id) {
        return repo.findById(id);
    }

    public void update(Person person) {
        Person person1 = getById(person.getId()).orElseThrow();
        person1.setName(person.getName());
        person1.setSurname(person.getSurname());
        repo.save(person1);
    }

    public int create(Person person) {
        Person person1 = repo.save(person);
        return person1.getId();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
