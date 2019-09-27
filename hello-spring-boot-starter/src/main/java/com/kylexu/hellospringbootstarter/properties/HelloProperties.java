package com.kylexu.hellospringbootstarter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.StringJoiner;

@ConfigurationProperties("hello")
public class HelloProperties {
    private String name;
    private Integer age;
    private String location;

    @Override
    public String toString() {
        return new StringJoiner(", ", HelloProperties.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("location='" + location + "'")
                .toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
