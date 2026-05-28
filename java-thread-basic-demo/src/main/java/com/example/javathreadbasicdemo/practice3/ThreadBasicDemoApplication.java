package com.example.javathreadbasicdemo.practice3;

import com.example.javathreadbasicdemo.practice.SynAsyncComparisonDemo;
import com.example.javathreadbasicdemo.practice2.ThreadCreationDemo;

public class ThreadBasicDemoApplication {

  public static void main(String[] args) {
    System.out.println("Java Thread 기초와 동기화 실습 시작");
    SynAsyncComparisonDemo.run();
    ThreadCreationDemo.run();
    ThreadLifecycleDemo.run();
    System.out.println("실습 종료");
  }

}
