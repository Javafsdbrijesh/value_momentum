package com.javafsd.orderdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javafsd.orderdetails.entity.OrderDetails;


@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long>{

}