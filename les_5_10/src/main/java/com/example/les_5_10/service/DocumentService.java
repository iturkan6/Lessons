package com.example.les_5_10.service;

import com.example.les_5_10.entity.Document;
import com.example.les_5_10.repository.DocumentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {
    private final DocumentRepo repo;

    public DocumentService(DocumentRepo repo) {
        this.repo = repo;
    }

    public List<Document> getAll() {
        return repo.findAll();
    }

    public Optional<Document> getById(int id) {
        return repo.findById(id);
    }

    public void update(Document document) {
        Document document1 = getById(document.getId()).orElseThrow();
        document1.setDoc_num(document.getDoc_num());
        document1.setReg_num(document.getReg_num());
        document1.setPerson(document.getPerson());
        repo.save(document1);
    }

    public int create(Document person) {
        return repo.save(person).getId();
    }

    public void delete(Document person) {
        repo.delete(person);
    }
}


