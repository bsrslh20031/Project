package com.example.library.Service;

import java.util.List;


import com.example.library.Entity.Student;

public interface StudentService {
	public Student getStudent(Integer id);
	public List<Student> getAllStudents();
	public String insertStudent(Student studentObject);
	public String updateStudent(Student studentObject);
	public String deleteStudent(Integer id);


}
