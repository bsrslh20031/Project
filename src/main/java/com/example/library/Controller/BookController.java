package com.example.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.Entity.Book;
import com.example.library.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService bookServiceObject;
	
	public BookController(BookService bookServiceObject) {
		this.bookServiceObject=bookServiceObject;
	}
	
	@GetMapping("getBook/{id}")
	public ResponseEntity<Book> get(@PathVariable("id") Integer id)
	{
		Book obj=bookServiceObject.getBook(id);
		return new ResponseEntity<>(obj,HttpStatus.OK);
	}
	
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>> getall(){
		List<Book> listOfBooks=bookServiceObject.getAllBooks();
		return new ResponseEntity<List<Book>>(listOfBooks,HttpStatus.OK);
	}
	
	@PostMapping("/insertBooks")
	public ResponseEntity<String> insert(@RequestBody Book bookObject){
		System.out.println(bookObject);
		String msg=bookServiceObject.insertBook(bookObject);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/updateBooks")
	public ResponseEntity<String> update(@RequestBody Book bookObject){
		String msg=bookServiceObject.updateBook(bookObject);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Integer id){
		String s=bookServiceObject.deleteBook(id);
		return new ResponseEntity<>(s,HttpStatus.OK);
	}

}