package com.example.apache_kafka_example.kafka_demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private static final Logger logger=LoggerFactory.getLogger(KafkaProducer.class);
	private KafkaTemplate<String,String> kafkaTemplate;
	
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		
		logger.info("message sent %s",message);
		kafkaTemplate.send("kafkapractice1",message);
	}

	
}
