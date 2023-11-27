package com.example.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Entity.Book;
import com.example.library.Repository.BookRepo;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookRepo bookRepoObject;
	
	public BookServiceImpl(BookRepo bookRepoObject) {
		this.bookRepoObject=bookRepoObject;
	}

	@Override
	public Book getBook(Integer id) {
		Optional<Book> obj=bookRepoObject.findById(id);
		return obj.get();
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> listOfBooks=bookRepoObject.findAll();
		System.out.println("The books present in the table");
		for(Book book:listOfBooks) {
			System.out.println(book);
		}
		return listOfBooks;
	}

	@Override
	public String insertBook(Book bookObject) {
		bookRepoObject.save(bookObject);
		return "Saved the Book";
	}

	@Override
	public String updateBook(Book bookObject) {
		bookRepoObject.save(bookObject);
		return "Updated the book";
	}

	@Override
	public String deleteBook(Integer id) {
		bookRepoObject.deleteById(id);
		return "Removed Book with id:"+id;
	}
	
	
		
		
		
	}

