package com.example.websocketPractice;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // "/topic"으로 시작하는 메시지에 대해서는 메시지 브로커가 처리하도록 설정
        registry.enableSimpleBroker("/topic");

        // "/app"으로 시작하는 메시지는 애플리케이션에서 처리하도록 설정
        registry.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // "/chat" 엔드포인트로 클라이언트가 WebSocket 연결을 시작할 수 있도록 설정
        registry.addEndpoint("/chat").withSockJS();
    }
}
