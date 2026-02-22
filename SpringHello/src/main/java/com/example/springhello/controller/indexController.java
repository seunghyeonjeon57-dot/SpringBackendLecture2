package com.example.springhello.controller;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {
    @GetMapping("/index")
    public String index(){
        return "index";

    }
    @PreDestroy
    public void cleanup() {
        System.out.println("========================================");
        System.out.println("★ [PreDestroy] 서버가 안전하게 종료됩니다. 자원을 반납합니다.");
        System.out.println("========================================");
    }
}
