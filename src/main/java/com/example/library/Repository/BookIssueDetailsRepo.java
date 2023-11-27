package com.example.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.Entity.BookIssueDetails;

public interface BookIssueDetailsRepo extends JpaRepository<BookIssueDetails,Integer> {

}