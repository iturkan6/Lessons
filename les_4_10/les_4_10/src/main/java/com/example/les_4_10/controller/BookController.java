package com.example.les_4_10.controller;

import com.example.les_4_10.entity.Book;
import com.example.les_4_10.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

  private final BookService service;

  public BookController(BookService service) {
    this.service = service;
  }

  @GetMapping("/books")
  public List<Book> handler(){
    return service.createBooks();
  }

  @GetMapping("/books/{name}")
  public Book handler1(@PathVariable String name){
    return service.getByName(name);
  }
}
