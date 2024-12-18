package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @MessageMapping("/addUser")
    public ChatMessage addUser(String username) {
        ChatMessage message = new ChatMessage();
        message.setType("JOIN");
        message.setSender(username);
        return message;
    }

    @MessageMapping("/removeUser")
    public ChatMessage removeUser(String username) {
        ChatMessage message = new ChatMessage();
        message.setType("LEAVE");
        message.setSender(username);
        return message;
    }
}
