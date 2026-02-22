package com.example.springhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HeaderController{
    @GetMapping("/headers")
    public String header(
            @RequestHeader("User-Agent") String userAgent
    ){
        return "User-Agent=" + userAgent;
    }

    @GetMapping("/cookies")
    @ResponseBody
    public String cookie(
            @CookieValue(value="SESSION",required = false)String session
    ){
        return "SESSION=" + session;
    }
}