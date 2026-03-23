package com.example.springtdd.Head02_JUnitBasicTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.springtdd.Head02_JUnitBasic.example1.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {

  private UserService service;

  @BeforeEach
  void setUp(){
    System.out.println("BeforeEach 실행");
    service = new UserService();
  }

  @AfterEach
  void tearDown(){
    System.out.println("AfterEach 실행");
  }

  @Test
  void createUser_shouldReturnName(){
    String result = service.create("kim");

    assertEquals("kim", result);
    System.out.println("createUser_shouldReturnName 실행");
  }
  @Test
  void createUser_shouldNotReturnNull(){
    String result = service.create("lee");
    assertNotNull(result);
    System.out.println("createUser_shouldNotReturnNull 실행");
  }

}
