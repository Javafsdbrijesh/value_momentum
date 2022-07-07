package com.javafsd.departmentservice.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.repository.DepartmentRepository;
import com.javafsd.departmentservice.service.impl.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {



        @Autowired
        private DepartmentRepository departmentRepository;

        @Override
        public Department saveDepartment(Department department)
        {
            Department departmentResponse = departmentRepository.save(department);
            return departmentResponse;
        }

        @Override
        public List<Department> getDepartments() {
            List<Department> departmentList = departmentRepository.findAll();
            return departmentList ;
        }

        @Override
        public Department getDepartmentById(Long departmentId) {
            Optional<Department> department =departmentRepository.findById(departmentId);
            return department.get();
        }

        @Override
        public Department getDepartmentByName(String name) {

            return null;
        }


    }