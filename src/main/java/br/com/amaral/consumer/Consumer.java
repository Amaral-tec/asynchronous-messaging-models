package br.com.amaral.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.amaral.configuration.RabbitMQConfiguration;

@Component
@RabbitListener(queues = RabbitMQConfiguration.NAME_QUEUE)
public class Consumer {
	
	@RabbitHandler
	public void consumeMessageByRabbitMQ(String message) {
		System.out.println("====== Receiving Message ======");
		System.out.println("====== " + message);
		System.out.println("====== End of Message ======");
	}

	@KafkaListener(topics = "${kafka.model.name.topic}", groupId = "modelGroup")
	public void consumeMessageByKafka(String message) {
		System.out.println("====== Receiving Message ======");
		System.out.println("====== " + message);
		System.out.println("====== End of Message ======");
	}
}
