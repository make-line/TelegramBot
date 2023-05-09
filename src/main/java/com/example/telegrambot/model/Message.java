package com.example.telegrambot.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Data
public class Message {
    String consumer;
    String name;
    String description;
    LocalDateTime timestamp;
    String okUrl;
    String cancelUrl;

}
