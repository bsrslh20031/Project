package com.example.library.Service;

import java.util.List;

import com.example.library.Entity.Book;

public interface BookService {
	public Book getBook(Integer id);
	public List<Book> getAllBooks();
	public String insertBook(Book bookObject);
	public String updateBook(Book bookObject);
	public String deleteBook(Integer id);

}
