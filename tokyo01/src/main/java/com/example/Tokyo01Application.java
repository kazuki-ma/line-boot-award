package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

@LineMessageHandler
@SpringBootApplication
public class Tokyo01Application {
    public static void main(String[] args) {
        SpringApplication.run(Tokyo01Application.class, args);
    }

    @EventMapping
    public TextMessage event(MessageEvent event){
        return TextMessage
                .builder()
                .text(event.toString())
                .build();
    }
}
