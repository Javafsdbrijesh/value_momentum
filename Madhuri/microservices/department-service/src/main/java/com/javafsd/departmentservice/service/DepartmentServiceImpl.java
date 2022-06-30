package com.javafsd.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.repository.DepartmentRepository;
import com.javafsd.departmentservice.service.impl.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) 
	{
		Department departmentResponse = departmentRepository.save(department);
		return departmentResponse;
		
	}
	
	@Override
	public Department getDepartmentById(Long departmentId) {
		java.util.Optional<Department> department = departmentRepository.findById(departmentId);
        return department.get();
	}
	

}
