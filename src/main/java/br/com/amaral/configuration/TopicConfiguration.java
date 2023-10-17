package br.com.amaral.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {

	@Value("${kafka.model.name.topic}")
	public String nameTopicModel;
	
	@Bean
	public NewTopic topicModel() {
		return TopicBuilder.name(nameTopicModel).partitions(1).replicas(1).build();
	}
}
