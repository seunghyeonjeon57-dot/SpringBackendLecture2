package com.example.springssedemo.dto;

public record NotificationResponse(
    String title,
    String content,
    String sendAt
) {

}
