package br.com.amaral.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.amaral.service.RabbitMQService;

@RestController
@RequestMapping("/messages")
public class Producer {

	@Autowired
	private RabbitMQService rabbitMQService;
	
	public void sendMessage(@RequestBody String menssage) {
		System.out.println("====== Send Message: " + menssage);
		
		rabbitMQService.sendMessage(menssage);
	}
}
