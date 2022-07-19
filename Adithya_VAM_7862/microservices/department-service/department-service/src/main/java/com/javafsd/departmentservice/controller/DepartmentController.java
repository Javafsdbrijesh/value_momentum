package com.javafsd.departmentservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.service.DepartmentServiceImpl;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentServiceImpl;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department)
    {
        Department departmentResponse =departmentServiceImpl.saveDepartment(department);
        return departmentResponse;

    }
    @GetMapping("/")
    public List<Department> findDepartments()
    {
        List<Department> departmentList = departmentServiceImpl.getDepartments();
        return departmentList;
    }
    @GetMapping("/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        Department department = departmentServiceImpl.getDepartmentById(departmentId);
        return department;
    }
}