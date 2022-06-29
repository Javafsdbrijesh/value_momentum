package com.javafsd.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentRepository, Long>{
	
	public DepartmentRepository findByDepartmentName(Stringname);
	
}
