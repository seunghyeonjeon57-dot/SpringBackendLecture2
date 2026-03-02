package com.example.demo.dto;

import com.example.demo.domain.Coffee;
import java.util.List;

public record OrderCreateRequest(
    Long memberId,
    List<OrderCoffeeRequest> coffeeList
) {

}
