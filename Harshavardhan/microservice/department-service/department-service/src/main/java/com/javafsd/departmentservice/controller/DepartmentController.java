package com.javafsd.departmentservice.controller;


import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.error.DepartmentNotFoundException;
import com.javafsd.departmentservice.service.impl.DepartmentService;
 
@RestController
@RequestMapping("/departments")
public class DepartmentController {
 
    @Autowired
    private DepartmentService departmentService;
	private Long departmentId;
 
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        Department departmentResponse = departmentService.saveDepartment(department);
        return departmentResponse;
    }
 
    @GetMapping("/")
    public List<Department> findDepartments(){
        List<Department> departmentList = departmentService.getDepartments();
        return departmentList;
    }
 
    @GetMapping("/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException{
        Department department = departmentService.getDepartmentById(departmentId);
        return department;
    }
        @GetMapping("/name/{name}")
        public Department fetchDepartmentById(@PathVariable("name") String department_Name) {
            Department department = departmentService.getDepartmentByName(department_Name);
            return department;
    }
        @DeleteMapping("/{id}")
        public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        	departmentService.deleteDepartmentById(departmentId);
    		return "department deleted successfully for department id"+ departmentId;
        	
        }
        @PutMapping("/{id}")
        public Department updateDepartment(@PathVariable("id") Long departnetId,@RequestBody Department department) {
        	Department department1 = departmentService.updateDepartment(department, departmentId);
        	return department1;
        }
}
