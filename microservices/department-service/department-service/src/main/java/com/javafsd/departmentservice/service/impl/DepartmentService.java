package com.javafsd.departmentservice.service.impl;

import java.util.List;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.error.DepartmentNotFoundException;




 
public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> getDepartments();

    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public Department getDepartmentByName(String name);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Department department, Long departmentId);

	public Department getDepartmentByName1(String name);

	public Department getDepartmentById1(Long departmentId) throws DepartmentNotFoundException;

	public Department updateDepartment1(Department department, Long departmentId);

	public Department saveDepartment1(Department department);

}