package com.javafsd.deptservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javafsd.deptservice.entity.Dept;

import com.javafsd.deptservice.service.impl.DeptService;
@RestController
@RequestMapping("/depts")
public class DeptController 
{
	@Autowired
	private DeptService deptService;
	
	@PostMapping("/")
	public Dept saveDept(@RequestBody Dept dept)
	{
		Dept deptResponse = deptService.saveDept(dept);
		return deptResponse;
	}
	
	@GetMapping("/")
	public List<Dept> findDepts()
	{
		List<Dept> deptList = deptService.getDepts();
		return deptList;
	}
	
	@GetMapping("/{id}")
	public Dept fetchDeptById(@PathVariable("id") Long deptId)
	{
		Dept dept = deptService.getDeptById(deptId);
		return dept;
	}
	
	@GetMapping("/name/{name}")
	public Dept fetchDeptByName(@PathVariable("name") String deptName)
	{
		Dept dept = deptService.getDeptByName(deptName);
		return dept;
	}
	
    /*for deleting in H2 console use this command "delete form department where department id=2;" It will delet 2nd ID*/
	
	@DeleteMapping("/{id}")
	public String deleteDeptById(@PathVariable("id") Long deptId)
	{
		deptService.deleteDeptById(deptId);
		return "Department deleted successfully for Department Id" + deptId;
	}
}
