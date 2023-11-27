package com.example.library.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Student")
public class Student{
	@Id
	@Column(name="studentid")
	private Long studentid;
	@Column(name="studentname")
	private String studentname;
	@Column(name="cardid")
	private Integer cardid; 
	@Column(name="studentemail")
	private String studentemail;
	@Column(name="studentphno")
	private String studentphno;
	
	@Override
	public String toString() {
		return "[studentid:"+studentid+"studentname:"+studentname+"cardid"+cardid+"studentemail:"+studentemail+"studentphno:"+studentphno+"]";
	}
}