package com.javafsd.userservice.feign.client;

import java.util.List;	
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.javafsd.userservice.vo.DepartmenView;

@FeignClient(name = "DEPARTMEN-SERVICE")
public class DepartmentClient 
{
	@GetMapping("/departmens/")
	public List<DepartmenView> findDepartmens();
}