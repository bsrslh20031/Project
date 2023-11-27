package com.example.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.library.Entity.BookIssueDetails;
import com.example.library.Repository.BookIssueDetailsRepo;
@Service
public class BookIssueDetailsServiceImpl implements BookIssueDetailsService{
	@Autowired
	BookIssueDetailsRepo bookissuedetailsRepoObject;
	
	public BookIssueDetailsServiceImpl(BookIssueDetailsRepo bookissuedetailsRepoObject) {
		this.bookissuedetailsRepoObject=bookissuedetailsRepoObject;
	}
    
	@Override
	public BookIssueDetails getBookIssue(Integer id) {
		Optional<BookIssueDetails> obj=bookissuedetailsRepoObject.findById(id);
		return obj.get();
	}



	@Override
	public String insertBookIssue(BookIssueDetails bookissuedetailsObject) {
		bookissuedetailsRepoObject.save(bookissuedetailsObject);
		return "Saved the Book issue record";
	}



	@Override
	public String updateBookIssue(BookIssueDetails bookissuedetailsObject) {
		bookissuedetailsRepoObject.save(bookissuedetailsObject);
		return "Updated the book issue Record";
	}

	@Override
	public List<BookIssueDetails> getAllBookIssues() {
		List<BookIssueDetails> listOfBookissues=bookissuedetailsRepoObject.findAll();
		System.out.println("The books present in the table");
		for(BookIssueDetails bookissuedetails:listOfBookissues) {
			System.out.println(bookissuedetails);
		}
		return listOfBookissues;
	}
	

	@Override
	public String deleteBookIssue(Integer id) {
		bookissuedetailsRepoObject.deleteById(id);
		return "Removed Book with id:"+id;
	}

}


