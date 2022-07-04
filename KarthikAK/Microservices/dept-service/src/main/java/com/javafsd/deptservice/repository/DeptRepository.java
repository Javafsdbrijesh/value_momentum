package com.javafsd.deptservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javafsd.deptservice.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long>
{
	public Dept findBydeptName(String name);
}
