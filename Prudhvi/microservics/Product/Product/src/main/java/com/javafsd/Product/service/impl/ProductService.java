package com.javafsd.Product.service.impl;

import java.util.List;

import com.javafsd.Product.entity.Product;

public interface ProductService {
public Product saveProduct(Product Product);
	
	public List<Product> getProducts();
	
	
	
	public Product getProductByName(String name);
	
	public void deleteProductById(Long ProductId);

	
}
