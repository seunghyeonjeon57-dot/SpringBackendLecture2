package com.example.springhello.Dto;

public record MemberDto(
        long id,
        String email,
        String name,
        String phone
) {
}
