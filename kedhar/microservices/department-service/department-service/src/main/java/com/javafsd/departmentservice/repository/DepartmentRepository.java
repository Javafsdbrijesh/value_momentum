package com.javafsd.departmenservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.javafsd.departmenservice.entity.Department;
 
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
 
    public Department findByDepartmentName(String name);
 
}