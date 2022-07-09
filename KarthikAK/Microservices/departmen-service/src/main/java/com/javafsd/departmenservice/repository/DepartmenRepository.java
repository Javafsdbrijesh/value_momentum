package com.javafsd.departmenservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javafsd.departmenservice.entity.Departmen;

@Repository
public interface DepartmenRepository extends JpaRepository<Departmen, Long>
{
	Departmen findByDepartmenName(String name);
}
