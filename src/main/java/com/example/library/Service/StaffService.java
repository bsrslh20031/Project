package com.example.library.Service;

import java.util.List;


import com.example.library.Entity.Staff;

public interface StaffService {
	public Staff getStaff(Integer id);
	public List<Staff> getAllStaffs();
	public String insertStaff(Staff staffObject);
	public String updateStaff(Staff staffObject);
	public String deleteStaff(Integer id);


}
