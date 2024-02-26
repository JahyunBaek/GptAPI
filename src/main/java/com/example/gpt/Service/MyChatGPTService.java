package com.example.gpt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.gpt.Dto.ChatGptResDto;
import com.example.gpt.Dto.ChatRequestDto;

import io.github.flashvayne.chatgpt.dto.ChatResponse;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;

@Service
public class MyChatGPTService {

    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;
    
    @Value("${openai.model}")
    private String model;
    
    @Value("${openai.api.url}")
    private String apiUrl;

    
    public ChatResponse getChatResponse(ChatRequestDto chatGptReq) throws Exception {

            ChatResponse response = restTemplate.postForObject(apiUrl, chatGptReq, ChatResponse.class);
            
            return response;
    }
}