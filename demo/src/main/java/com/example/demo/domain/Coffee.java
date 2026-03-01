package com.example.demo.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "coffees")
public class Coffee {
  @Column(nullable = false)
  private Order order;
  @Id
  private Long id;

  private String name;
  private int price;

  protected Coffee(){}

  public Order getOrder() {
    return order;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}
