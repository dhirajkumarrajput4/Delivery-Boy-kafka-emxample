package com.deliverBoy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic NewTopic(){
        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)
//                .partitions()
//                .replicas()
                .build();
    }
}
