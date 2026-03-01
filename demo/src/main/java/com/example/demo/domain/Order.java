package com.example.demo.domain;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
  @Column(nullable = false)
  private Coffee coffee;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true)
  private List<OrderCoffee> orderCoffees=new ArrayList<>();


  protected Order(){}

  public Coffee getCoffee() {
    return coffee;
  }

  public Long getId() {
    return id;
  }
}
