package com.example.springhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController{
    @GetMapping("/users2/{id}")
    public String getUser(@PathVariable Long id){
        return "userId=" + id;
    }
}
