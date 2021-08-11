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

        messageRepository.save(new Message("Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
        messageRepository.save(new Message("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."));
        messageRepository.save(new Message("It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));

    }

}
