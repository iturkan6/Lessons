package com.example.les_4_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/fw")
public class RedirectController {
  @GetMapping("/a")
  public String handler(){
    //process
    return "forward:/books";
  }

  @GetMapping("/b")
  public String handlerById(){
    //process
    return "forward:/books/Apple";
  }

  @GetMapping("/c")
  public String handlerById1(){
    //process
    return "redirect:/books/Apple";
  }

  @GetMapping("/d")
  public RedirectView handlerById2(){
    //process
    return new RedirectView("/books");
  }


}
