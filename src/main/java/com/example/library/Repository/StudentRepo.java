package com.example.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.Entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>  {

}
