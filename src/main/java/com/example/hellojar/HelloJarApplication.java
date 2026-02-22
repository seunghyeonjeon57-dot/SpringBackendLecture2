package com.example.hellojar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloJarApplication {
    public static void main(String[] args){
        SpringApplication.run(HelloJarApplication.class,args);}

    @GetMapping("/")
    public String hello(){
        return "Hello,Executable JAR";
    }

    @GetMapping("/info")
    public String info(){
        return String.format(
                "Java Version: %s, Spring Boot: %s",
                System.getProperty("java.version"),
                HelloJarApplication.class.getPackage().getImplementationVersion()
        );



        }
    }


