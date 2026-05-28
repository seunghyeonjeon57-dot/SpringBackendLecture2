package com.example.javathreadbasicdemo;

import com.example.javathreadbasicdemo.practice.SynAsyncComparisonDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaThreadBasicDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(JavaThreadBasicDemoApplication.class, args);
    System.out.println("Java Thread 기초와 동기화 실습 시작");
    SynAsyncComparisonDemo.run();
    System.out.println("실습 종료");
  }

}
