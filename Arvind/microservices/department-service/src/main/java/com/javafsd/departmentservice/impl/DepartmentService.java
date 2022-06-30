package com.javafsd.departmentservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.repository.DepartmentRepository;


public interface DepartmentService {
	
	public Department saveDepartment(Department department);
	public List<Department> getDepartments();
	public Department getDepartmentById(Long departmentId);
	public Department getDepartmentByName(String name);
	
}
