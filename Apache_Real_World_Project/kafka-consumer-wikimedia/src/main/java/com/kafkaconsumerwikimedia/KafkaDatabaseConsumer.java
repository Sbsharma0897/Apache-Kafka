package com.kafkaconsumerwikimedia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
	
	@Autowired
	private WikiMediaDataRepo wikiMediaDataRepo;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

	@KafkaListener(topics = "wikimedia_recent",groupId = "myGroup")
	public void consumer(String message)
	{
		LOGGER.info(String.format("message received %s",message));
		
		WikiMediaData wikiMediaData=new WikiMediaData();
		wikiMediaData.setWikiEventData(message);
		
		wikiMediaDataRepo.save(wikiMediaData);
		
	}
}
