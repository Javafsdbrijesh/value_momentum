package com.javafsd.departmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.repository.DepartmentRepository;
import com.javafsd.departmentservice.service.DepartmentServiceimpl;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentServiceimpl departmentService;
	
	@PostMapping("/")
	public DepartmentController saveDepartment(@RequestBody DepartmentController department) {
		DepartmentController departmentResponse = departmentServiceimpl.saveDepartment(department);
		return  departmentResponse;
		}

	@GetMapping("/")
	public List<DepartmentController> findDepartments(){
		List<DepartmentRepository> departmentList = departmentServiceimpl.getDepartments();
		return departmentList;
	}
	
	@GetMapping("/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		Department department = departmentServiceimpl.getDepartmentById(departmentId)
        return department;
	}
	
	@GetMapping("/name/{name}")
	public DepartmentController fetchDepartmentById(@PathVariable("name") String departmentName) {
		Department department = departmentServiceimpl.getDepartmentByName(departmentName)
        return department;
}
	DeleteMapping("/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Department deleted successfully for Department Id" + departmentId;
		
	}
}
