package com.example.programmingTask.controller;

import com.example.programmingTask.model.Message;
import com.example.programmingTask.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class MessageViewController {
    @Value("${spring.application.name}")
    String appName;

    @Autowired
    MessageService messageService;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);

        StringBuilder messageConcat = new StringBuilder();
        List<Message> messages = messageService.getAllMessages();
        model.addAttribute("messages", messages);
        return "home";
    }
}
