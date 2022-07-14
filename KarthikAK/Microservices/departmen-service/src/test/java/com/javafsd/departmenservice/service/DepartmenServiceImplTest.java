package com.javafsd.departmenservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.javafsd.departmenservice.entity.Departmen;
import com.javafsd.departmenservice.repository.DepartmenRepository;
import com.javafsd.departmenservice.service.impl.DepartmenService;

@SpringBootTest
public class DepartmenServiceImplTest 
{
	@Autowired
	private DepartmenService departmenService;
	
	@MockBean
	private DepartmenRepository departmenRepository;
	
	@BeforeEach
	void setup()
	{
		Departmen departmen = new Departmen();
		departmen.setDepartmenName("HR");
		departmen.setDepartmenAddress("Pune");
		departmen.setDepartmenCode("HR077");
		departmen.setDepartmenId(1L);
		
		Mockito.when(departmenRepository.findByDepartmenName("HR")).thenReturn(departmen);
	}
	
	@Test
	@DisplayName("Get Departmen data based on Valid Departmen Name")
	public void whenvalidDepartmenName_thenDepartmenShouldFound()
	{
		String departmenName = "HR";
		Departmen departmenResponse = departmenService.getDepartmenByName(departmenName);
		assertEquals(departmenName, departmenResponse.getDepartmenName());
	}
}
