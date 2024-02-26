package com.example.gpt.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Message {
    private String role;
    private String content;

    Message(String role, String content) {
        this.role = role;
        this.content = content;
    }
}
