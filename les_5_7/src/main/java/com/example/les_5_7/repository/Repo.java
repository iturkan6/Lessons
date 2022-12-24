package com.example.les_5_7.repository;

import com.example.les_5_7.entity.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Userr, Integer> {
}
