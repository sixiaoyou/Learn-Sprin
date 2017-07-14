package com.jike.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class StuInterceptorXml {

    /**
     * 打印方法AOP
     */

    public void printMethod() {
    }

    public void printBeforeAdvice() {
        System.out.println("printBeforeAdvice()!");
    }

    public void printAfterAdvice(String name) {
        System.out.println("printAfterAdvice()! " + name);
    }

    public void finallyAdvice() {
        System.out.println("finallyAdvice()!");
    }

    public Object printAroundAdvice(ProceedingJoinPoint pjp, String name) throws Throwable {
        Object result = null;
        if (name.equals("whc"))
            pjp.proceed();
        else
            System.out.println("print()方法以及被拦截...");
        return result;
    }
}
