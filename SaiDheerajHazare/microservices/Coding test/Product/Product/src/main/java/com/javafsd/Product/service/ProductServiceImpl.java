package com.javafsd.Product.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.Product.entity.Product;
import com.javafsd.Product.repository.ProductRepository;
import com.javafsd.Product.serviceimpl.ProductService;



	@Service
	public class ProductServiceImpl implements ProductService {
	    @Autowired
	    private ProductRepository productRepository;

	    private final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	    @Override
	    public Product saveProduct(Product Product)
	    {
	        Product ProductResponse = productRepository.save(Product);
	        LOGGER.info("Product saved successfully in database");

	        return ProductResponse;
	    }

	    @Override
	    public List<Product> getProducts() {
	        List<Product> ProductList = productRepository.findAll();
	        return ProductList ;
	    }

		@Override
		public Product getProductById(Long ProductId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Product getProductByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Product updateProduct(Product Product, Long ProductId) {
			// TODO Auto-generated method stub
			return null;
		}

	}
