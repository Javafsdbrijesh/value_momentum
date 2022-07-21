package com.javafsd.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javafsd.Product.entity.Product;

	@Repository
	public interface ProductRepository extends JpaRepository<Product,Long> {
	    public Product findByDepartmentName(String main);
	}


