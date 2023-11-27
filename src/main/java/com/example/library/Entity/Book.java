package com.example.library.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Book")
public class Book {
	@Id
	@Column(name="bookid")
	private Integer bookid;
	@Column(name="booktitle")
	private String booktitle;
	@Column(name="authorname")
	private String authorname;
	@Column(name="booksavailable")
	private Integer booksavailable;
	
	@Override
	public String toString() {
		return "[bookid"+bookid+"booktitle"+booktitle+"authorname"+authorname+"booksavailable"+booksavailable+"]";
	}

}
