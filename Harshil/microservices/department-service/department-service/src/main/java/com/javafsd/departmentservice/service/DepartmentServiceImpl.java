package com.javafsd.departmentservice.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.error.DepartmentNotFoundException;
import com.javafsd.departmentservice.repository.DepartmentRepository;
import com.javafsd.departmentservice.service.impl.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	 @Autowired
	    private DepartmentRepository departmentRepository;

	    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentServiceImpl.class);

	    @Override
	    public Department saveDepartment(Department department)
	    {
	        Department departmentResponse = departmentRepository.save(department);
	        LOGGER.info("Department saved successfully in database");

	        return departmentResponse;
	    }

	    @Override
	    public List<Department> getDepartments() {
	        List<Department> departmentList = departmentRepository.findAll();
	        return departmentList ;
	    }
	    @Override
	    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
	        Optional<Department> department =departmentRepository.findById(departmentId);
	        if(!department.isPresent()) {
	        throw new DepartmentNotFoundException("Department not Available for Department Id: " + departmentId);    

	        }
	        return department.get();
	    }

	   
	    

	    @Override
	    public Department getDepartmentByName(String name) {
	        Department department = departmentRepository.findBydepartmentName(name);
	        return department;
	    }

	    @Override
	    public Department updateDepartment(Department departmentReq, Long departmentId) {
	        Department departmentDB = departmentRepository.findById(departmentId).get();

	        if(Objects.nonNull(departmentReq.getDepartmentName()) &&
	                !"".equalsIgnoreCase(departmentReq.getDepartmentName()))
	        {
	            departmentDB.setDepartmentName(departmentReq.getDepartmentName());
	            LOGGER.info("Department Name updated successfully");
	        }
	        if(Objects.nonNull(departmentReq.getDepartmentAddress()) &&
	                !"".equalsIgnoreCase(departmentReq.getDepartmentAddress()))
	        {
	            departmentDB.setDepartmentAddress(departmentReq.getDepartmentAddress());
	            LOGGER.info("Department Name updated successfully");
	        }
	        if(Objects.nonNull(departmentReq.getDepartmentCode()) &&
	                !"".equalsIgnoreCase(departmentReq.getDepartmentCode()))
	        {
	            departmentDB.setDepartmentCode(departmentReq.getDepartmentCode());
	            LOGGER.info("Department Name updated successfully");
	            }
	        return departmentRepository.save(departmentDB) ;
	        }
	}
