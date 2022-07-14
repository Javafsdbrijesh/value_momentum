package com.javafsd.Department.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.Department.entity.Department;
import com.javafsd.Department.repository.DepartmentRepository;





@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		Department departmentResponse = departmentRepository.save(department);
		return departmentResponse;
		
	}

}


	

	
	



