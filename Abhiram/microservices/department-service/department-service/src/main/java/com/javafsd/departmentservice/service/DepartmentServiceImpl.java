package com.javafsd.departmentservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.error.DepartmentNotFoundException;
import com.javafsd.departmentservice.Impl.DepartmentService;
import com.javafsd.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;
	 private final Logger LOGGER = LoggerFactory.getLogger(DepartmentServiceImpl.class);
//

	 @Override
	    public Department saveDepartment(Department department) {
	        Department departmentResponse = departmentRepository.save(department);
	        LOGGER.info("Department saved successfully in database");
	        return departmentResponse; 
	    }
	 
	    @Override
	    public List<Department> getDepartments() {
	        List<Department> departmentList = departmentRepository.findAll();
	        return departmentList;
	    }
	 
	    @Override
	    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
	        Optional<Department> department = departmentRepository.findById(departmentId);
	        if(!department.isPresent()) {
	            throw new DepartmentNotFoundException("Department not Available for Department Id: " + departmentId);
	        }
	        return department.get();
	    }
	 
	    @Override
	    public Department getDepartmentByName(String name) {
	        Department department = departmentRepository.findByDepartmentName(name);
	        return department;
	    }
	 
	    @Override
	    public void deleteDepartmentById(Long departmentId) {
	        departmentRepository.deleteById(departmentId);
	    }
	 
	    @Override
	    public Department updateDepartment(Department departmentReq, Long departmentId) {
	        Department departmentDB = departmentRepository.findById(departmentId).get();
	        
	 
	        Department dept = departmentRepository.save(departmentDB);
	 
	        return dept;
	    }
	}