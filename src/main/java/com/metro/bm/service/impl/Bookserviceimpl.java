package com.metro.bm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.metro.bm.entity.Book;
import com.metro.bm.service.BookService;
import com.metro.bm.repository.BookRepository;
@Service
public class Bookserviceimpl implements BookService {
	
	private BookRepository BookRepository;
	

	public Bookserviceimpl(BookRepository bookRepository) {
		super();
		BookRepository =  bookRepository;
	}


	@Override
	public List<Book> getallbooks() {
		return BookRepository.findAll();
	}

}
