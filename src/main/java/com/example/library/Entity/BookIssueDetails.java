package com.example.library.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Issue")
public class BookIssueDetails {
	@Id
	@Column(name="issueid")
	private Integer issueid;
	@Column(name="issuedate")
	private Timestamp issuedate;
	@Column(name="returningdate")
	private Timestamp returningdate;
	@Column(name="period")
	private Integer period;
	
	@Override
	public String toString() {
		return "[issueid:"+issueid+"issuedate:"+issuedate+"returningdate:"+returningdate+"period"+period+"]";
	}

}
