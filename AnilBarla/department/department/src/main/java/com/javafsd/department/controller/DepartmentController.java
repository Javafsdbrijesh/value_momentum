package com.javafsd.department.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.department.entity.Department;
import com.javafsd.department.error.DepartmentNotFoundException;
import com.javafsd.department.impl.DepartmentService;
import com.javafsd.department.service.impl.*;


@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	 private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		Department departmentResponse=departmentService.saveDepartment(department);
		return departmentResponse;
	}
	   @GetMapping("/")
	    public List<Department> findDepartments(){
		   LOGGER.debug("Inside findDepartments method");
	        LOGGER.info("Inside findDepartments method");
	        List<Department> departmentList = departmentService.getDepartments();
	        return departmentList;
	    }
	 
	    @GetMapping("/{id}")
	    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
	    	  LOGGER.info("Inside fetchDepartmentById method");
	        Department department = departmentService.getDepartmentById(departmentId);
	        LOGGER.info("Inside fetchDepartmentById method, Response : " + department);
	        return department;
	    }
	    
	    @GetMapping("/name/{name}")
	    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
	        Department department = departmentService.getDepartmentByName(departmentName);
	        return department;
	    }
	    
	    @DeleteMapping("/{id}")
	    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
	        departmentService.deleteDepartmentById(departmentId);
	        return "Department deleted successfully for Department Id" + departmentId;
	    }
	    
	    @PutMapping("/{id}")
	    public Department updateDepartment(@PathVariable("id") Long departmentId,
	            @RequestBody Department department) {
	        Department departmentRes = departmentService.updateDepartment(department, departmentId);
	        return departmentRes;
	 
	    }
		

}



