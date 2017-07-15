package com.jike.spring.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;




public class TestBeforeAdvice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Waiter target = new NativeWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        ProxyFactory pf = new ProxyFactory();
        
        pf.setTarget(target);
        pf.addAdvice(advice);
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("John");
    }

}
