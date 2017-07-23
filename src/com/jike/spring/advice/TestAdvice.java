package com.jike.spring.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdvice {

    public static void main (String[] args){
//        String confPath = "conf/conf-advice.xml";
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(confPath);
//        Waiter waiter = (Waiter) ctx.getBean("waiter");;
//        waiter.greetTo("Tom");
//        waiter. serveTo("Tom");
        testThrowsAdvice();
    }
    
    public static void testThrowsAdvice(){
        String confPath = "conf/conf-advice.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(confPath);
        ForumService forumService = (ForumService) ctx.getBean("forumService");
        try {
            forumService.removeForum();
        } catch (Exception e) {
  
        }
   
    
    }
    
}
