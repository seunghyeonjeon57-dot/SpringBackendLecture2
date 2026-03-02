package com.example.demo.domain;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true)
  private List<OrderCoffee> orderCoffees=new ArrayList<>();

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="member_id",nullable = false)
  private Member member;


  protected Order(){}
  public Order(Member member){
    this.member=member;
  }


  public Long getId() {
    return id;
  }

  public Member getMember() {
    return member;
  }

  public List<OrderCoffee> getOrderCoffees() {
    return orderCoffees;
  }

  public void addOrderCoffee(OrderCoffee oc){
    this.orderCoffees.add(oc);

  }
}
