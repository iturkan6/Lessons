package com.example.les_4_10.controller;

import com.example.les_4_10.entity.Book;
import com.example.les_4_10.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/entity")
public class ResponseEntityController {
  private final BookService service;

  public ResponseEntityController(BookService service) {
    this.service = service;
  }

  @GetMapping("/{name}")
  public ResponseEntity<String> handler(@PathVariable String name) {
    Book book = service.getByName(name);
//    return ResponseEntity.ok(book); //return entity and status 200
//    return (ResponseEntity<Book>) ResponseEntity.badRequest();
//    return ResponseEntity.status(201); //Define any status
//    return new ResponseEntity<>(book, HttpStatus.CONFLICT);
    return new ResponseEntity<>("User created", HttpStatus.OK);
  }
}
