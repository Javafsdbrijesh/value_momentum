package com.javafsd.Product.serviceimpl;

import java.util.List;

import com.javafsd.Product.entity.Product;




public interface ProductService {

    public Product saveProduct(Product Product);
    public List<Product> getProducts();
    public Product getProductById(Long ProductId); 
    public Product getProductByName(String name);

    public Product updateProduct(Product Product, Long ProductId);
}

