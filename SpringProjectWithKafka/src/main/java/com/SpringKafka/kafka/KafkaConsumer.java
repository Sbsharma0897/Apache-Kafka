package com.SpringKafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.SpringKafka.User;

@Service
public class KafkaConsumer {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "firstTopic",groupId = "myGroup")
	public void consumerMessage(String message)
	{
		LOGGER.info(String.format("mesage reveievd %s", message));
	}
	
	@KafkaListener(topics = "firstTopic_Json",groupId = "myGroup")
	public void consumerObject(User user)
	{
		LOGGER.info(String.format("mesage reveievd %s", user.toString()));
	}
	

}  
