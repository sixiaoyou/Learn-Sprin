package com.jike.spring.config;

public class HelloWorldImpl implements HelloWorld {
    private String message;

    /*
     * 空构造函数
     */

    public HelloWorldImpl() {
        super();
    }

    /*
     * 带参构造函数
     */
    public HelloWorldImpl(String message) {
        super();
        this.message = message;
    }

    @Override
    public void sayHello() {
        // TODO Auto-generated method stub
        System.out.println("Hello World!");

    }

}
