package com.example.les_6_4.service;

import com.example.les_6_4.dto.UseerLogin;
import com.example.les_6_4.dto.UseerRequest;
import com.example.les_6_4.entity.Useer;
import com.example.les_6_4.repository.UseerRepo;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UseerService {

    private final UseerRepo repo;

    public UseerService(UseerRepo repo) {
        this.repo = repo;
    }

    public Integer registration(UseerRequest useerRequest) { // create
        return repo.save(fill(useerRequest, new Useer())).getId();
    }

    private Useer fill(UseerRequest request, Useer db_useer) {
        db_useer.setName(request.name());
        db_useer.setPassword(cryptPassword(request.password()));
        db_useer.setUsername(request.username());
        return db_useer;
    }

    private String cryptPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    public Integer login(UseerLogin useerLogin) {
        Useer useer = repo.findAllByUsername(useerLogin.username()).orElseThrow();

        return BCrypt.checkpw(useerLogin.password(), useer.getPassword()) ? useer.getId() : null;
    }
}
