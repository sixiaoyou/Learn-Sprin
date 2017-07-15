package com.jike.spring.advice;

import java.lang.reflect.Method;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.aop.MethodBeforeAdvice;

import com.jike.spring.aop.ProxyFactory;

public class GreetingBeforeAdvice  implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        // TODO Auto-generated method stub
        String clientName = (String) args[0];
        System.out.println("How are you! Mr." + clientName);
    }

}
