package com.SpringKafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic firstTopic()
	{
		 return TopicBuilder.name("firstTopic")
				 .build();
	}
	
	@Bean
	public NewTopic firstTopicJson()
	{
		 return TopicBuilder.name("firstTopic_Json")
				 .build();
		
	}

}
