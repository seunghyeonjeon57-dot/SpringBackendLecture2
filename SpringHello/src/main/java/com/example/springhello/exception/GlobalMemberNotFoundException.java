package com.example.springhello.exception;

public class GlobalMemberNotFoundException extends RuntimeException {
    public GlobalMemberNotFoundException(Long id) {
        super("존재하지 않는 회원입니다. id=" + id);
    }
}