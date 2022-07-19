package com.javafsd.UserService.feign.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="DEPARTMENT-SERVICE")
public interface DepartmentClient {

	@GetMapping("/departments/")
	public List<DepartmentView> findDepartments();
}