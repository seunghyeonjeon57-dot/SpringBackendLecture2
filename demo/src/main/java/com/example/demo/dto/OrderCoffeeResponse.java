package com.example.demo.dto;

public record OrderCoffeeResponse(
    Long coffeeId,
    String coffeeName,
    int price,
    int quantity

) {

}
