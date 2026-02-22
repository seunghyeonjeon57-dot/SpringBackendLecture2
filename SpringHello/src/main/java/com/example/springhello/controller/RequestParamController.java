package com.example.springhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController{
    @GetMapping("/search")
    public String search(
        @RequestParam String keyword,
        @RequestParam int page){
        return "keyword= " + keyword + ",page = " + page;
    }
}
