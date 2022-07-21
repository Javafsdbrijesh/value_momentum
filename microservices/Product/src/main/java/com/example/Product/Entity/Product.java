package com.example.Product.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name="product")
public class Product {

    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Product(long productId, String productName, String productAddress, String productCode) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productAddress = productAddress;
        this.productCode = productCode;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="product_generator")
    @SequenceGenerator(name="product_generator", sequenceName="product_seq", allocationSize=50)
    @Column(name="product_id", updatable=false, nullable=false)
    private long productId;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_address")
    private String productAddress;

    @Column(name="product_code")
    private String productCode;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductAddress() {
        return productAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.productAddress = productAddress;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}