package com.javafsd.OrderDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.OrderDetails.entity.OrderDetails;
import com.javafsd.OrderDetails.service.OrderDetailsService;

@RestController
	@RequestMapping("/order")
	public class OrderDetailsController {

	    @Autowired
	    private OrderDetailsService orderDetailsService;

	    public OrderDetails saveorder(@RequestBody OrderDetails order) {
	        OrderDetails userResp = orderDetailsService.saveOrderDetails(order);
	        return userResp;
	}
}
