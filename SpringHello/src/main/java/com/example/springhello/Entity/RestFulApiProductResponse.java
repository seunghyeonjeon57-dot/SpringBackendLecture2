package com.example.springhello.Entity;

public class RestFulApiProductResponse {
    private Long id;
    private String name;

    public RestFulApiProductResponse(){
    }

    public RestFulApiProductResponse(Long id,String name){
        this.id = id;
        this.name= name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
