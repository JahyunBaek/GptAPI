package com.example.gpt.Dto;

import java.util.ArrayList;
import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.gpt.Dto.Message;

@Data
public class ChatRequestDto {
    private String model;
    private List<Message> messages;
    private int n;
    private double temperature;

    public ChatRequestDto(String model, String prompt) {
        this.model = model;
        
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }
}
