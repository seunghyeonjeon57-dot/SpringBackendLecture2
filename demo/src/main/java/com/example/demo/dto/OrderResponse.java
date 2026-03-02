package com.example.demo.dto;

import java.util.List;

public record OrderResponse(
    Long orderId,
    Long memberId,
    List<OrderCoffeeResponse> coffees
) {

}
