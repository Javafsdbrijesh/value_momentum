package com.javafsd.departmentservice.service.impl;

import java.util.List;

import com.javafsd.departmentservice.entity.Department;

public interface DepartmentService {
	
	public Department saveDepartment(Department department)
	
	public List<Department> getDepartment();

    public Department getDepartmentById(Long departmentId);
    
    public Department getDepartmentByName(String name);
    
    public void deleteDepartmentById(Long departmentId);
    
}
