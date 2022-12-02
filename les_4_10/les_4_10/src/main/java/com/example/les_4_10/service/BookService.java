package com.example.les_4_10.service;

import com.example.les_4_10.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
  ArrayList<Book> books = new ArrayList<>();

  public List<Book> createBooks() {
    Book book1 = new Book();
    book1.setAuthor("Tolstoy");
    book1.setName("War and peace");
    Book book2 = new Book();
    book2.setAuthor("Anar");
    book2.setName("Apple");
    books.add(book1);
    books.add(book2);
    return books;
  }
  public Book getByName(String name){
    for (Book book: books) {
      if(book.getName().equals(name)) {
        return book;
      }
    }
    return null;
  }
}
