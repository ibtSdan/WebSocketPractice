package com.example.websocketPractice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j

public class PostController {
    private SimpMessagingTemplate messagingTemplate;

    @PostMapping("/write")
    public void writePost(@RequestBody String content){
        // 웹소켓을 통해 실시간 처리

        messagingTemplate.convertAndSend("/topic/posts", content);
    }
}
