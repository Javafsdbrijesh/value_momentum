package com.javafsd.department.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.javafsd.department.entity.Department;
import com.javafsd.department.impl.DepartmentService;
import com.javafsd.department.repository.DepartmentRepository;


@SpringBootTest
class DepartmentServiceImplTest {
	
	  @Autowired
	    private DepartmentService departmentService;
	  
	  @MockBean
	    private DepartmentRepository departmentRepository;
	  
	  @BeforeEach
	    void setup() {
	        Department department = new Department();
	        department.setDepartmentName("Dev");
	        
	        Mockito.when(departmentRepository.findByDepartmentName("Dev")).thenReturn(department);

	  }
	  @Test
	    @DisplayName("Get Department data based on Valid Department Name")
	    public void whenvalidDepartmentName_thenDepartmentShouldFound() {
	        String departmentName = "Dev";
	        Department departmentResponse = departmentService.getDepartmentByName(departmentName);
	        assertEquals(departmentName, departmentResponse.getDepartmentName());
	  
}
}
