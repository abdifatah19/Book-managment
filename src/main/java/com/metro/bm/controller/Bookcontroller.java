package com.metro.bm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.metro.bm.service.BookService;

@Controller
public class Bookcontroller {
	
private BookService BookService;

public Bookcontroller(BookService bookService) {
	super();
	bookService = BookService;
}
//handler
@GetMapping("/students")
public String listStudents(Model model) {
//return
}
}
