package com.jike.spring.config;

public class HelloWorldStaticFactory {

    public static HelloWorld newInstance(String message) {
        return new HelloWorldImpl(message);
    }

}
