package com.example.springhello;


import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="app.notification.enabled", havingValue = "true")
public class NotificationManager {
    @PostConstruct
    public void init(){
        System.out.println("==========================================");
        System.out.println("알림 매니저: 조건이 충족되어 메모리에 생성됨!");
        System.out.println("==========================================");
    }
}
