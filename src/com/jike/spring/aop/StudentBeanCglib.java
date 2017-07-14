package com.jike.spring.aop;

public class StudentBeanCglib{
    private String name;

    public StudentBeanCglib() {
    };

    public StudentBeanCglib(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void print(){
        System.out.println("Hello World!");
    }
}
