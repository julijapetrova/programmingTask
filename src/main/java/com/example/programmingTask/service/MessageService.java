package com.example.programmingTask.service;

import com.example.programmingTask.model.Message;
import com.example.programmingTask.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return (List<Message>) messageRepository.findAll();
    }

    public void saveMessage(Message message) {
        messageRepository.save(message);
    }
}
