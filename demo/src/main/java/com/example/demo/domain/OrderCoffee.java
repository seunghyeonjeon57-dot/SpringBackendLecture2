package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderCoffee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="order_id",nullable = false)
  private Order order;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="coffee_id",nullable = false)
  private Coffee coffee;
  @Column(nullable = false)
  private int quantity;

  protected OrderCoffee(){}

  public OrderCoffee(Coffee coffee,int quantity){
    this.coffee=coffee;
    this.quantity=quantity;
  }

  public Long getId() {
    return id;
  }

  public Order getOrder() {
    return order;
  }

  public Coffee getCoffee() {
    return coffee;
  }

  public int getQuantity() {
    return quantity;
  }
  void setOrder(Order order){
    this.order=order;
  }
}
