package com.metro.bm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metro.bm.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
