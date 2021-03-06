package com.example.springboot_componentscan;

import org.springframework.stereotype.Component;

@Component
public class Girl {
    private String name;
    private Integer age;

    public Girl() {
    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
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
}
