package com.example.les_5_12.repository;

import com.example.les_5_12.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepo extends JpaRepository<Document, Integer> {
}
