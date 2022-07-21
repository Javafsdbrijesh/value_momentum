package com.javafsd.OrderDetails.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "orderDetails") 
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "orderdetailsid")
    private Long orderDetailsId;

    @Column(name = "orderaddress")
    private String orderAddress;

    @Column(name = "orderdescription")
    private String orderDescription;

    

    public OrderDetails() {

    }

    public OrderDetails(Long orderDetailsId, String orderAddress, String orderDescription) {
        super();
        this.orderDetailsId = orderDetailsId;
        this.orderAddress = orderAddress;
        this.orderDescription = orderDescription;
    }

    public Long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }


}