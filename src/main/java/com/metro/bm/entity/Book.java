package com.metro.bm.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="book")
public class Book {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
@Column(name="book-name", nullable=false)
private String name;
@Column(name="author_name", nullable=false)
private String author;
@Column(name="book-name")
private Date  yearPublished;
public Book() {
	
}

public Book(String name, String author, Date yearPublished) {
	super();
	this.name = name;
	this.author = author;
	this.yearPublished = yearPublished;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Date getYearPublished() {
	return yearPublished;
}
public void setYearPublished(Date yearPublished) {
	this.yearPublished = yearPublished;
}

}
