package br.com.amaral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Value("${kafka.model.name.topic}")
	private String nameTopicModel;
	
	public void sendMessage(String message) {
		kafkaTemplate.send(nameTopicModel, message);
	}
}
