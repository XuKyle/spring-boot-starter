package com.kylexu.hellospringbootstarter.service;

public class HelloService {
    private String name;
    private Integer age;
    private String location;

    public HelloService(String name, Integer age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String sayHello(String name) {
        return "Hello," + name;
    }

    public String helloWorld() {
        return String.format("[name=%s, age=%d, location=%s]", this.name, this.age, this.location);
    }
}
