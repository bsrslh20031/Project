package com.example.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.library.Entity.Staff;
import com.example.library.Repository.StaffRepo;
@Service
public class StaffServiceImpl implements StaffService{
	@Autowired
	StaffRepo staffRepoObject;
	
	public StaffServiceImpl(StaffRepo staffRepoObject) {
		this.staffRepoObject=staffRepoObject;
	}

	@Override
	public Staff getStaff(Integer id) {
		Optional<Staff> obj=staffRepoObject.findById(id);
		return obj.get();
	}

	@Override
	public List<Staff> getAllStaffs() {
		List<Staff> listOfStaffs=staffRepoObject.findAll();
		System.out.println("The staff present in the table");
		for(Staff staff:listOfStaffs) {
			System.out.println(staff);
		}
		return listOfStaffs;
	}

	@Override
	public String insertStaff(Staff staffObject) {
		staffRepoObject.save(staffObject);
		return "Saved the Staff";
	}

	@Override
	public String updateStaff(Staff staffObject) {
		staffRepoObject.save(staffObject);
		return "Updated the Staff";
	}

	@Override
	public String deleteStaff(Integer id) {
		staffRepoObject.deleteById(id);
		return "Removed Staff with id:"+id;
	}
}
