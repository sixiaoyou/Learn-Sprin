package com.jike.spring.advice;

public class NativeWaiter implements Waiter {

    @Override
    public void greetTo(String name) {
        // TODO Auto-generated method stub
        System.out.println("greet to " + name + "...");
    }

    @Override
    public void serveTo(String name) {
        // TODO Auto-generated method stub
        System.out.println("serving " + name + "...");
    }

}
