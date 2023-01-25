package com.example.les_6_4.repository;

import com.example.les_6_4.entity.Useer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UseerRepo extends JpaRepository<Useer, Integer> {
    Optional<Useer> findAllByUsername(String username);
}
