package com.example.les5_2.repository;

import com.example.les5_2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

    List<Person> findAllByName(String name);

//    @Query("select * from ")
//    List<Person> myAwesomeQuery();
}
