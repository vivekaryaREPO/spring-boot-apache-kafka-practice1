package com.example.apache_kafka_example.kafka_demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	
	private static final Logger logger=LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics="kafkapractice1",groupId="myGroup")
	public void consume(String message) {
		logger.info(String.format("message is %s", message));
	}

}
