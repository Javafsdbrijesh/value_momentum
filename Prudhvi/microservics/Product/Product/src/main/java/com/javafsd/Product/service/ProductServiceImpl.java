package com.javafsd.Product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.stereotype.Service;

import com.javafsd.Product.entity.Product;
import com.javafsd.Product.service.impl.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired 
	private ProductRepository ProductRepository;

	

	@Override
	public List<Product> getProducts() {
		List<Product> ProductList = ProductRepository.findAll();
		return ProductList;
	}

	

	@Override
	public Product getProductByName(String name) {
		Product Product = ProductRepository.findByProductName(name);
		return Product;
	}

	@Override
	public void deleteProductById(Long ProductId) {
		ProductRepository.deleteById(ProductId);
	}

	
}
