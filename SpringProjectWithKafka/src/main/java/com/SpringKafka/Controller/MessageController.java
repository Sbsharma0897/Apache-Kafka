package com.SpringKafka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringKafka.User;
import com.SpringKafka.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<String> publishMesage(@PathVariable String message)
	{
		kafkaProducer.sendMessage(message);
		return new ResponseEntity<String>("message published",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/publish")
	public ResponseEntity<String> publishObject(@RequestBody User user )
	{
		kafkaProducer.sendObject(user);
		return new ResponseEntity<String>("message published",HttpStatus.ACCEPTED);
	}

}
