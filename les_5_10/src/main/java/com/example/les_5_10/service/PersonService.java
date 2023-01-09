package com.example.les_5_10.service;

import com.example.les_5_10.entity.Document;
import com.example.les_5_10.entity.Person;
import com.example.les_5_10.entity.PersonRequest;
import com.example.les_5_10.repository.DocumentRepo;
import com.example.les_5_10.repository.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepo repo;
    private final DocumentRepo documentRepo;
    private final DocumentService documentService;

    public PersonService(PersonRepo repo, DocumentRepo documentRepo, DocumentService documentService) {
        this.repo = repo;
        this.documentRepo = documentRepo;
        this.documentService = documentService;
    }

    public List<Person> getAll() {
        return repo.findAll();
    }

    public Optional<Person> getById(int id) {
        return repo.findById(id);
    }

    public void update(Person user) {
        Person person = getById(user.getId()).orElseThrow();
        person.setName(user.getName());
        person.setSurname(user.getSurname());
        repo.save(person);
    }

    public int create(Person person) {
        return repo.save(person).getId();
    }

    public Integer createC(PersonRequest person) {
        Person person1 = new Person();
        person1.setId(person.id());
        person1.setName(person.name());
        person1.setSurname(person.surname());


        Document document = documentRepo.findById(person.doc_id()).orElseThrow();
        person1.setDocument(document);
        return repo.save(person1).getId();
    }
    public Integer createCommon(Person person) {
        Person person1 = new Person();
        person1.setId(person.getId());
        person1.setName(person.getName());
        person1.setSurname(person.getSurname());
        if(person.getDocument() != null && person.getDocument().getId() != null) {
//            person1.setDocument(documentService.getById(person.getDocument().getId()).orElseThrow());
            person1.setDocument(documentRepo.findById(person.getDocument().getId()).orElseThrow());
        }else {
            person1.setDocument(person.getDocument());
        }
        return repo.save(person1).getId();
    }
}
