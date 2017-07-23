package com.jike.spring.config;

public class HelloWorldInstanceFactory {
    public  HelloWorld newInstance(String message) {
        return new HelloWorldImpl(message);
    }
}
