package com.example.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Product.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {
     public Product findByproductName(String name);
}