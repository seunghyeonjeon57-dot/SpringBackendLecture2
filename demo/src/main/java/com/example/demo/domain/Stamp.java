package com.example.demo.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stamps")
public class Stamp {
  @Id
  private Long id;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="member_id",nullable = false,unique = true)
  private Member member;
  private int stampCount;

  protected Stamp(){}

  public Long getId() {
    return id;
  }

  public Member getMember() {
    return member;
  }

  public int getStampCount() {
    return stampCount;
  }
}
