package br.com.amaral.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.amaral.configuration.RabbitMQConfiguration;

@Component
public class RabbitMQService {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessage(String message) {
		rabbitTemplate.convertAndSend(RabbitMQConfiguration.NAME_EXCHANGE, "model.route.message", message);
	}
}
