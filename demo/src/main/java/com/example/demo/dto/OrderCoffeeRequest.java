package com.example.demo.dto;

public record OrderCoffeeRequest(
    Long coffeeId,
    int quantity
) {

}
