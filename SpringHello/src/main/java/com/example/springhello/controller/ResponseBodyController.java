package com.example.springhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ResponseBodyController {
    @GetMapping("/v1/coffees/info")
    public Map<String,Object> getCoffeeInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("name","콜드블루");
        map.put("price",4000);
        return map;

    }
}
