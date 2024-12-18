package com.example.websocketPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

public class PostController {

    @PostMapping("/write")
    public void writePost(@RequestBody String content){
        // 웹소켓을 통해 실시간 처리
    }
}
