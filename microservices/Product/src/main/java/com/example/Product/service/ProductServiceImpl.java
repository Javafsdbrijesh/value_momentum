package com.example.Product.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.Product.Entity.Product;
import com.example.Product.Repository.ProductRepository;



@Service
public class ProductServiceImpl implements ProductService{

    @Autowired private ProductRepository productRepository;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public Product saveProduct(Product product) {
    	Product productResponse = productRepository.save(product);
        LOGGER.info("Product saved successfully in database");
        return productResponse; 
    }

    @Override
    public List<Product> getProducts() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    @Override
    public Product getProductById(Long productId) throws ProductNotFoundException {
        Optional<Product> product = productRepository.findById(productId);
        if(!product.isPresent()) {
            throw new ProductNotFoundException("Product not Available for Product Id: " + productId);
        }
        return product.get();
    }

    @Override
    public Product getProductByName(String name) {
    	Producer product = CrudRepository.findByproductName(name);
        return product;
    }

    @Override
    public void deleteProductById(Long productId) {
    	productRepository.deleteById(productId);
    }

    @Override
    public Product updateProduct(Product productReq, Long productId) {
    	Product productDB = productRepository.findById(productId).get();

        if(Objects.nonNull(productReq.getProductName()) && 
                !"".equalsIgnoreCase(productReq.getProductName())){
        	productDB.setProductName(productReq.getProductName());
            LOGGER.info("Product Name updates successfully");
        }
        if(Objects.nonNull(productReq.getProductAddress()) && 
                !"".equalsIgnoreCase(productReq.getProductAddress())) {
        	productDB.setProductAddress(productReq.getProductAddress());
            LOGGER.info("Product Address updates successfully");
        }
        if(Objects.nonNull(productReq.getProductCode()) && 
                !"".equalsIgnoreCase(productReq.getProductCode())) {
        	productDB.setProductCode(productReq.getProductCode());
            LOGGER.info("Product  Code updated successfully");
        }

        Product dept = ProductRepository.save(productDB);

        return dept;
    }
}