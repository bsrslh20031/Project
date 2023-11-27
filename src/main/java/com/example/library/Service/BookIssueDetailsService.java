package com.example.library.Service;

import java.util.List;

import com.example.library.Entity.BookIssueDetails;

public interface BookIssueDetailsService {
	public BookIssueDetails getBookIssue(Integer id);
	public List<BookIssueDetails> getAllBookIssues();
	public String insertBookIssue(BookIssueDetails bookissuedetailsObject);
	public String updateBookIssue(BookIssueDetails bookissuedetailsObject);
	public String deleteBookIssue(Integer id);

}