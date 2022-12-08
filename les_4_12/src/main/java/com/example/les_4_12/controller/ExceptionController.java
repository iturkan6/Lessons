package com.example.les_4_12.controller;

import com.example.les_4_12.entity.Book;
import com.example.les_4_12.exceptions.BookNotFoundException;
import com.example.les_4_12.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExceptionController {
    private final BookService service;

    public ExceptionController(BookService service) {
        this.service = service;
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Book> handler(@RequestParam int id) {
        Book book = service.getById(id).orElseThrow(BookNotFoundException::new);
        return ResponseEntity.ok(book);
    }
}
