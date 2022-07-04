package com.javafsd.department.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.department.entity.Department;
import com.javafsd.department.repository.DepartmentRepository;





@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		Department departmentResponse = departmentRepository.save(department);
		return departmentResponse;
		
	}

}


	

	
	



