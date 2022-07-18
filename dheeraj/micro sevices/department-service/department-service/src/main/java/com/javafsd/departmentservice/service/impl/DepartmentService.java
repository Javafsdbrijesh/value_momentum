package com.javafsd.departmentservice.service.impl;

import java.util.List;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.error.DepartmentNotFoundException;

public interface DepartmentService 
{

    public Department saveDepartment(Department department);
    public List<Department> getDepartments();
    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException ;
    public Department getDepartmentByName(String name);

    public Department updateDepartment(Department department, Long departmentId);
}