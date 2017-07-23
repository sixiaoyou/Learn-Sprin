package com.jike.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GreetingAfterAdvice implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object returnObj, Method method, Object[] argument, Object object) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Please enjoy yourself!");
    }
  
}
