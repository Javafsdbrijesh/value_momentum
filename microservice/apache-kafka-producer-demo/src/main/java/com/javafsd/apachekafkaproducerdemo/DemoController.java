package com.javafsd.apachekafkaproducerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	KafkaTemplate<String, Book> kafkaTemplate;

	private static final String TOPIC = "JavafsdTopic";
	private static final String TOPIC2 = "TestTopic";

	/*
	 * @GetMapping("/public/{message}") public String
	 * publishMeshage(@PathVariable("message") final String message) {
	 * 
	 * 
	 * kafkaTemplate.send(TOPIC,message); return "Message Published successfuly";
	 */
	@PutMapping("/public")
	public String publishMessage(@RequestBody Book book) {
		kafkaTemplate.send(TOPIC2, book);
		return "Message Published successfuly";
	}
}
