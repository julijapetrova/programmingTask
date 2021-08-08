package com.example.programmingTask;

import com.example.programmingTask.model.Message;
import com.example.programmingTask.repository.MessageRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class ProgrammingTaskApplication {

    public static void main(String[] args) {

//		SpringApplication.run(ProgrammingTaskApplication.class, args);
        ConfigurableApplicationContext ctx = SpringApplication.run(ProgrammingTaskApplication.class, args);
        MessageRepository messageRepository = ctx.getBean(MessageRepository.class);

//        Message message = new Message("Hi, this is the first message");
//        messageRepository.save(message);
    }

}
