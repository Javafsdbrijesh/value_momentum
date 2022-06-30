package com.javafsd.departmentservice.service.impl;

import com.javafsd.departmentservice.entity.Department;

public interface DepartmentService {
	public Department saveDepartment(Department department);

	public Department getDepartmentById(Long departmentId);

}
