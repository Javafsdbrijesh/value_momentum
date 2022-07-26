package com.javafsd.Product.controller;

import java.util.List;

import javax.validation.Valid;





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

