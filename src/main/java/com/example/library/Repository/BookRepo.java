package com.example.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.Entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
