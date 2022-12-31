package com.SpringKafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.SpringKafka.User;

@Service
public class KafkaProducer {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate1;
	
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate2;
	
	
   public void sendMessage(String message)
    {
	   LOGGER.info(String.format("Message sent %s",message));
	   kafkaTemplate1.send("firstTopic",message);
	   
   }
   
   public void sendObject(User user )
   {
	   LOGGER.info(String.format("Message sent %s",user.toString()));
	   kafkaTemplate2.send("firstTopic_Json", user);
	   
  }
}
