package com.example.springssedemo.dto;

public record CreateNotificationRequest(
    String targetUserId,
    String title,
    String content
) {

}
