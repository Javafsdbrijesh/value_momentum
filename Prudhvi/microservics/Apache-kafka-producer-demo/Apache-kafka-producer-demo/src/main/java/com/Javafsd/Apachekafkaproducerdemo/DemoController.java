package com.Javafsd.Apachekafkaproducerdemo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;







@RestController

public class DemoController {

  @Autowired 

       KafkaTemplate<String, String> kafkaTemplate;

 

  private static final String TOPIC = "JavafsdTopic";

 

  @GetMapping("/publish/{message}")

       public String publishMessage(@PathVariable("message") final String message) {

             return "Message Published Succesfully";

       }

}

