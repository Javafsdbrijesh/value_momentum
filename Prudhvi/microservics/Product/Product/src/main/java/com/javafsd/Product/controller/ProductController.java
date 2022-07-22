package com.javafsd.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.Product.entity.Product;
import com.javafsd.Product.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productService;
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product product) {
		Product productResponse = productService.saveProduct(product);
		return productResponse;
	}
	@GetMapping("/name/{name}")
	public Product fetchProductByName(@PathVariable("name") String ProductName) {
		Product Product = ProductServiceImpl.getProductByName(ProductName);
		return Product;
	}

	@DeleteMapping("/{id}")
	public String deleteProductById(@PathVariable("id") Long ProductId) {
		ProductServiceImpl.deleteProductById(ProductId);
		return "Product deleted successfully for Product Id" + ProductId;
	}

	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable("id") Long ProductId,
			@RequestBody Product Product) {
		Product ProductRes = ProductServiceImpl.updateProduct(Product, ProductId);
		return ProductRes;

	}

}
