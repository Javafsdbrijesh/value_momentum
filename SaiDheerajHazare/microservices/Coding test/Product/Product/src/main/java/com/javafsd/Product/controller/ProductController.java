package com.javafsd.Product.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.Product.entity.Product;
import com.javafsd.Product.serviceimpl.ProductService;



@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
    private ProductService productService;

   


    @PostMapping("/")
    public Product saveProduct(@Valid @RequestBody Product product)
    {
        Product ProductResponse =productService.saveProduct(product);
        return ProductResponse;
    }
    @GetMapping("/")
    public List<Product> findProducts()
    {
       
        List<Product> ProductList = productService.getProducts();
        return ProductList;
    }

    @GetMapping("/{id}")
    public Product fetchProductById(@PathVariable("id") Long ProductId) {
        
        Product Product = productService.getProductById(ProductId);
       
        return Product;
    }

}
