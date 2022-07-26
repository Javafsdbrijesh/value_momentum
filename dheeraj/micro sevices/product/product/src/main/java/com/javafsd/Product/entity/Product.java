package com.javafsd.Product.entity;




@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="department_generator")
    @SequenceGenerator(name="product_generator",sequenceName ="product_seq",allocationSize=50)
    @Column(name="product_ID",updatable= false,nullable = false)
    private long productId;
    @Column(name="product_name")
    private String productName;
    @Column(name="Order_Details_Id")
    private long orderDetailsId;
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
    public long getOrderDetailsId() {
        return orderDetailsId;
    }
    public void setOrderDetailsId(long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }
    public Product(long productId, String productName, long orderDetailsId) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.orderDetailsId = orderDetailsId;
    }
    public Product() {

    }
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", orderDetailsId=" + orderDetailsId
                + "]";
    }

    
}

