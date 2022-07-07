package com.javafsd.departmentservice.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.error.DepartmentNotFoundException;
import com.javafsd.departmentservice.repository.DepartmentRepository;


public interface DepartmentService {
	
	public Department saveDepartment(Department department);
	public List<Department> getDepartments();
	public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;
	public Department getDepartmentByName(String name);
	public Department updateDepartment(Department departmentReq, Long departmentId);
	public void deleteDepartmentById(Long departmentId);
	
}