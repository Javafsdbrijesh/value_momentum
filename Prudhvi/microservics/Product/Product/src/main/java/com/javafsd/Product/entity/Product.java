package com.javafsd.Product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private long productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_name")
	private String orderDetailsId;
	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the orderDetailsId
	 */
	public String getOrderDetailsId() {
		return orderDetailsId;
	}
	/**
	 * @param orderDetailsId the orderDetailsId to set
	 */
	public void setOrderDetailsId(String orderDetailsId) {
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
