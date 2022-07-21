package com.example.Product.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/products/")
public class ProductController {
 
    @Autowired
    private ProductService productService;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
 
    @PostMapping("/")
    public Product saveProduct( @RequestBody Product product) {
    	Product departmentResponse = ProductService.saveProduct(product);
        return ProductResponse;
    }
 
    @GetMapping("/")
    public List<Product> findProducts(){
        LOGGER.debug("Inside findProducts method");
        LOGGER.info("Inside findProducts method");
        List<Product> departmentList = productService.getProducts();
        return productList;
    }
 
    @GetMapping("/{id}")
    public Product fetchProductById(@PathVariable("id") Long producttId) throws ProductNotFoundException{
        LOGGER.info("Inside fetchProductById method");
        Product product = productService.getProductById(ProductId);        
        LOGGER.info("Inside fetchProductById method, Response : " + department);
        return product;
    }
 
    @GetMapping("/name/{name}")
    public Product fetchProductByName(@PathVariable("name") String productName) {
    	Product department = productService.getProductByName(productName);
        return department;
    }
 
    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable("id") Long productId) {
    	productService.deleteProductById(productId);
        return "Product deleted successfully for Product Id" + productId;
    }
 
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long productId,
            @RequestBody Product product) {
    	Product productRes = productService.updateProduct(product, productId);
        return productRes;
 
    }
}