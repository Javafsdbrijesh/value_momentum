package com.javafsd.OrderDetails.service;

import org.springframework.stereotype.Component;

import com.javafsd.OrderDetails.entity.OrderDetails;

@Component
	public interface OrderDetailsService {

	    public OrderDetails saveDetails(OrderDetails details);

	}

