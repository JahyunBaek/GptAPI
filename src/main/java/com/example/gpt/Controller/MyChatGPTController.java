package com.example.gpt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gpt.Dto.ChatGptResDto;
import com.example.gpt.Dto.ChatRequestDto;
import com.example.gpt.Service.MyChatGPTService;

import io.github.flashvayne.chatgpt.dto.ChatResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/chatGPT")
@RestController
public class MyChatGPTController {

    private final String qreQuestion = "안녕, ChatGPT! 나 질문이 있어.";

    private final MyChatGPTService chatGPTService;


    @ResponseBody
    @PostMapping("/askChatGPT")
    public ResponseEntity<ChatResponse> askToChatGPT(@RequestBody ChatRequestDto chatGptReq) throws Exception {

           
            ChatResponse chatGptRes = chatGPTService.getChatResponse(chatGptReq);

            return ResponseEntity.ok(chatGptRes);
    }
}
