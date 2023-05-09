package com.example.telegrambot.listener;

import com.example.telegrambot.model.Message;
import com.example.telegrambot.model.User;
import com.example.telegrambot.service.TelegramService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j

public class MessageListener {
    private final TelegramService telegramService;
    @KafkaListener(id = "class-level", topics = "tg", containerFactory = "messageKafkaListenerContainerFactory")
    @KafkaHandler
    void listener(Message message) {
        System.out.println(message);
        telegramService.sendMessageToUser(message.getName() + "\n" + message.getDescription() + "\n" + message.getTimestamp()
                        + "\nПодтвердить " + message.getOkUrl() + "\nОтменить " + message.getCancelUrl(),
                message.getConsumer());
    }
}
