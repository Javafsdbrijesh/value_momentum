package com.javafsd.department.impl;

import java.util.List;

import com.javafsd.department.entity.Department;
import com.javafsd.department.error.DepartmentNotFoundException;

public interface DepartmentService {
	
	public Department saveDepartment(Department department);
	public List<Department> getDepartments();
	public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;
	public Department getDepartmentByName(String name);
	public void deleteDepartmentById(Long departmentId);
	public Department updateDepartment(Department department, Long departmentId);
	

}
