package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderCoffee {

  @ManyToOne(fetch = FetchType.LAZY)
  private Order order;
  @ManyToOne(fetch = FetchType.LAZY)
  private Coffee coffee;
  private int quantity;

}
