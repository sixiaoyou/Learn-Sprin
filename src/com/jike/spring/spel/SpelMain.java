package com.jike.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        testSpelLiteral();
        testSpelClass();

    }

    private static void testSpelLiteral() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/conf-spel.xml");
        SpelLiteral spelLiteral = ctx.getBean("spelLiteral", SpelLiteral.class);
        System.out.println("count:" + spelLiteral.getCount());
        System.out.println("message:" + spelLiteral.getMessage());
        System.out.println("frequency:" + spelLiteral.getFrequency());
        System.out.println("capacity:" + spelLiteral.getCapacity());
        System.out.println("name1:" + spelLiteral.getName1());
        System.out.println("name2:" + spelLiteral.getName2());
        System.out.println("enabled:" + spelLiteral.isEnabled());

    }

    private static void testSpelClass() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/conf-spel.xml");
        SpelClass spelClass = ctx.getBean("spelClass", SpelClass.class);

        System.out.println("pi:" + spelClass.getPi());
        System.out.println("randomNumber:" + spelClass.getRandomNumber());
    }
}
