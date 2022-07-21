package com.javafsd.OrderDetails.serviceimpl;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.web.client.RestTemplate;

import com.javafsd.OrderDetails.entity.OrderDetails;
import com.javafsd.orderdetails.repository.OrderDetailsRepository;


	@Service
	public class OrderDetailsServiceImpl implements OrderDetailsService{

	    @Autowired
	    private OrderDetailsRepository orderdetailsrepository;


	    @Autowired
	    private RestTemplate restTemplate;

	    @Override
	    public OrderDetails saveDetails(OrderDetails details) {
	        OrderDetails userResp = orderdetailsrepository.save(details);
	        return userResp;
	    }

	}

