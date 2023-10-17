package br.com.amaral.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.amaral.service.KafkaService;
import br.com.amaral.service.RabbitMQService;

@RestController
@RequestMapping("/messages")
public class ProducerController {

	@Autowired
	private RabbitMQService rabbitMQService;
	
	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping(value = "/send-message-by-rabbitmq")
	public void sendMessageByRabbitMQ(@RequestBody String menssage) {
		System.out.println("====== Send Message: " + menssage);
		
		rabbitMQService.sendMessage(menssage);
	}
	
	@PostMapping(value = "/send-message-by-kafta")
	public void sendMessageByKafka(@RequestBody String menssage) {
		System.out.println("====== Send Message: " + menssage);
		
		kafkaService.sendMessage(menssage);
	}
	
}
