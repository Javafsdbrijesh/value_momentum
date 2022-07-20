package com.javafsd.departmentservice.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.error.DepartmentNotFoundException;
import com.javafsd.departmentservice.repository.DepartmentRepository;
import com.javafsd.departmentservice.service.impl.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository ;
 
	@Override
	public Department saveDepartment(Department department) {
		Department departmentResponse = departmentRepository.save(department);
		return departmentResponse;
	
	}

	@Override
	public List<Department> getDepartments() {
		List<Department> departmeList = departmentRepository.findAll();
		return departmeList;
	}

	@Override
	public Department getDepartmentById(Long DepartmentId) throws DepartmentNotFoundException {
		Optional<Department> department = departmentRepository.findById(DepartmentId);
		if(! department.isPresent()) {
			throw new DepartmentNotFoundException("Department not found for department id: " + DepartmentId);
			
		}
		return department.get();
	}



	@Override
	public Department getDepartmentByName(String Name) {
		Department department = departmentRepository.findByDepartmentName(Name);
		return department;
	}

	public void deletedepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);	
	}

	@Override
	public Department updateDepartment(Department departmentReq, Long departmentId) {
		Department departmentDB = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(departmentReq.getDepartmentName()) && 
				!"".equalsIgnoreCase(departmentReq.getDepartmentName())) {
			departmentDB.setDepartmentName(departmentReq.getDepartmentName());
		}
		if(Objects.nonNull(departmentReq.getDepartmentAddress()) && 
		        !"".equalsIgnoreCase(departmentReq.getDepartmentAddress())) {
		            departmentDB.setDepartmentAddress(departmentReq.getDepartmentAddress());
		}
		if(Objects.nonNull(departmentReq.getDepartmentCode()) && 
		        !"".equalsIgnoreCase(departmentReq.getDepartmentCode())) {
		            departmentDB.setDepartmentCode(departmentReq.getDepartmentCode());

		}
		Department dept = departmentRepository.save(departmentDB);
	
		return dept;
		
	}


}