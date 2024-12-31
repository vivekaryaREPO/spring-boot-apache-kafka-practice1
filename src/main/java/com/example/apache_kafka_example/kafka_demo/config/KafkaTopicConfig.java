package com.example.apache_kafka_example.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	
	
	@Bean
	public NewTopic myNewTopic() {
		return TopicBuilder.name("kafkapractice1")
				.build();
	}

}
