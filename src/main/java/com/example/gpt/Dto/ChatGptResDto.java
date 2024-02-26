package com.example.gpt.Dto;

import java.util.List;

import io.github.flashvayne.chatgpt.dto.Choice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatGptResDto {
     private List<Choice> choices;

     @Data
     @NoArgsConstructor
     public static class Choice {
        private int index;
        private Message message;
    }
     
}
