package com.example.programmingTask.controller;

import com.example.programmingTask.ProgrammingTaskApplication;
import com.example.programmingTask.model.Message;
import com.example.programmingTask.repository.MessageRepository;
import com.example.programmingTask.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping("/")
    public String getMessage() {
        return "\"/\" getAllMessages \"/all\" addMessage \"/message/add\"";
    }

    @RequestMapping("/all")
    public String getAllMessages() {
        return messageService.getAllMessages().toString();
    }

    @RequestMapping("/message/add")
    public String addMessage(@RequestParam(value = "messageContent", defaultValue = "") String messageContent) {
        Message message = new Message(messageContent);
        messageService.saveMessage(message);
        return message.getId() + " " + message.getMessageContent();
    }

}
