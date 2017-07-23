package com.jike.spring.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

public class GreetingInterceptorAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation arg0) throws Throwable {
        // TODO Auto-generated method stub
        Object[] args = arg0.getArguments();
        String clientName = (String) args[0];
        System.out.println("GreetingInterceptor:How are you?");
        Object obj = arg0.proceed();
        System.out.println("GreetingInterceptor:Please enjoy yourself!");
        return obj;
    }

}
