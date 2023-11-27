package com.example.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.Entity.Staff;

public interface StaffRepo extends JpaRepository<Staff,Integer> {

}
