package com.chat.app.model;

import lombok.Data;

@Data
public class ChatMessage {

    private String content;
    private String sender;
    private String type;
}
