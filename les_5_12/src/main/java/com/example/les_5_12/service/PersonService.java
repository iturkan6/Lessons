package com.example.les_5_12.service;

import com.example.les_5_12.entity.Person;
import com.example.les_5_12.repository.DocumentRepo;
import com.example.les_5_12.repository.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepo repo;
    private final DocumentRepo documentRepo;

    public PersonService(PersonRepo repo, DocumentRepo documentRepo) {
        this.repo = repo;
        this.documentRepo = documentRepo;
    }

    public List<Person> getAll() {
        return repo.findAll();
    }

    public Optional<Person> getById(int id) {
        return repo.findById(id);
    }

    public void update(Person person1) {
        Person person = getById(person1.getId()).orElseThrow();
        person.setName(person1.getName());
        person.setSurname(person1.getSurname());
        person.setDocuments(person1.getDocuments());
        repo.save(person);
    }

    public int create(Person person) {
        return repo.save(person).getId();
    }

//    public Integer process(Person person) {
//        Person personForDb;
//        if(person.getId() != null) {
//            personForDb = setField(getById(person.getId()).orElseThrow());
//        }else {
//            personForDb = person;
//        }
//        return repo.save(personForDb).getId();
//    }

    public Integer process(Person person) {
        return repo.save(person.getId() != null ? setField(getById(person.getId()).orElseThrow()) : person).getId();
    }

    private Person setField(Person person){
        person.setName(person.getName());
        person.setSurname(person.getSurname());
        person.setDocuments(person.getDocuments());
        return person;
    }

//
//    public int createCommon(Person person){
//        var person1 = new Person();
//        person1.setId(person.getId());
//        person1.setName(person.getName());
//        person1.setSurname(person.getSurname());
//        person1.setDocument(person.getDocument() != null && person.getDocument().getId() != null ?
//                documentRepo.findById(person.getDocument().getId()).orElseThrow() :
//                                                                              person.getDocument());
//        return repo.save(person1).getId();
//    }

    public void delete(Person person) {
        repo.delete(person);
    }
}


