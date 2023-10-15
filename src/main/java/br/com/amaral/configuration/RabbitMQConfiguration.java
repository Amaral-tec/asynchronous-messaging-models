package br.com.amaral.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

	public static final String NAME_QUEUE = "queue-model";
	public static final String NAME_EXCHANGE = "exchange-model";
	public static final String NAME_ROUTE = "model.route.#";
	
	@Bean
	private Queue queue() {
		return new Queue(NAME_QUEUE, false);
	}
	
	@Bean
	private TopicExchange exchange() {
		return new TopicExchange(NAME_EXCHANGE);
	}
	
	@Bean
	private Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(NAME_ROUTE);
		
	}
}
