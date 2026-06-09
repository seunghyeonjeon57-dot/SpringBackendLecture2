package com.example.springssedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringSseDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringSseDemoApplication.class, args);
  }

}
