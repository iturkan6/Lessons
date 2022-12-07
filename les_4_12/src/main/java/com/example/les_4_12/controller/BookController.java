package com.example.les_4_12.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class BookController {
    @GetMapping("/book")
    public ModelAndView handleError() {
        log.info("Exception is caught");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("x", 5);
        modelAndView.addObject("y", 7);
        modelAndView.setViewName("book_not_found5");
        modelAndView.setStatus(HttpStatus.NOT_FOUND);
        return modelAndView;
    }

    @GetMapping("/book1")
    public ModelAndView handleError1() {
        log.info("Exception is caught");
        ModelAndView modelAndView = new ModelAndView("book_not_found5");
        modelAndView.addObject("x", 5);
        modelAndView.addObject("y", 7);
        modelAndView.setStatus(HttpStatus.NOT_FOUND);
        return modelAndView;
    }

    @PostMapping("/book")
    @ResponseStatus(HttpStatus.CREATED)
    public void createBook() {
        // creating new book
    }

    @RequestMapping("/books")
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Please send right field information")
    public void error() {
        // creating new book
    }

    @RequestMapping("books1")
    public void handler(@RequestParam int age) {
        if (age > 18) {
            System.out.println("Access granted");
        }else {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "You are too young");
            //new ResponseEntity<String>(HttpStatus.CONFLICT)
        }
    }
}
