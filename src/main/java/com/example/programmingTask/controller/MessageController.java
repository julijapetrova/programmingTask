package com.example.programmingTask.controller;

import com.example.programmingTask.model.Message;
import com.example.programmingTask.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
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
        StringBuilder messageConcat = new StringBuilder();
        List<Message> messages = messageService.getAllMessages();
        for (Message message : messages)
            messageConcat.append(message.getId()).append(" ").append(message.getMessageContent()).append("\n");
        return messageConcat.toString();
    }

    @RequestMapping("/message/add")
    public String addMessage(@RequestParam(value = "messageContent", defaultValue = "") String messageContent) {
        Message message = new Message(messageContent);
        messageService.saveMessage(message);
        return message.getId() + " " + message.getMessageContent();
    }

}
