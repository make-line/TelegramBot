package com.example.telegrambot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class KafkaTopicConfig {

    @Bean
    public NewTopic emailTopic() {
        return TopicBuilder.name("email").build();
    }

    @Bean
    public NewTopic smsTopic() {
        return TopicBuilder.name("sms").build();
    }

    @Bean
    public NewTopic tgTopic() {
        return TopicBuilder.name("tg").build();
    }
}