package com.example.les_4_12.service;

import com.example.les_4_12.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    List<Book> books = new ArrayList<>();

    public Optional<Book> getById(int id) {
        for (Book book: books) {
            if (book.getId() == id) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }


}
