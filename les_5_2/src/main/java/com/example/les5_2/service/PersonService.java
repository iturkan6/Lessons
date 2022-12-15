package com.example.les5_2.service;

import com.example.les5_2.entity.Person;
import com.example.les5_2.repository.PersonRepo;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class PersonService {

    private final PersonRepo repo;

    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }

    public void savePerson(Person person) {
        repo.save(person);
    }

    public Optional<Person> getPersonById(int id) {
        return repo.findById(id);
    }
    public List<Person> getAllPersons() {
        return repo.findAll();
    }

    public List<Person> getAllByName(String name) {
        return repo.findAllByName(name);
    }

    @SneakyThrows
    public void updatePersonById(Person person) {
        Person person_from_db = getPersonById(person.getId()).orElseThrow();
        person_from_db.setName(person.getName());
        repo.save(person_from_db);

    }

    public void deletePersonById(int id) {
        repo.deleteById(id);
        log.info("Person with id - {} was deleted", id);
    }
}
