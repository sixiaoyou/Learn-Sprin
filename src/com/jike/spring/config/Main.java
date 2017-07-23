package com.jike.spring.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // // TODO Auto-generated method stub
        // sayHelloWorldByClass();
        // sayHelloWorldById();
        // sayHelloWorldByName();
        // sayHelloWorldByNameAndId();
        // sayHelloWorldByMultiName();
        // sayHelloWorldByAlias();
        // sayHelloWithNoArgs();
        // sayHelloWithArgs();
//        sayHelloWithStaticFactory();
        sayHelloWithInstanceFactory();

    }

    public static void sayHelloWorldByClass() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean(HelloWorldImpl.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWorldById() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();

    }

    public static void sayHelloWorldByName() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldByName", HelloWorld.class);
        helloWorld.sayHello();

    }

    public static void sayHelloWorldByNameAndId() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld01 = beanFactory.getBean("helloWorldById", HelloWorld.class);
        helloWorld01.sayHello();
        HelloWorld helloWorld02 = beanFactory.getBean("helloWorldByName01", HelloWorld.class);
        helloWorld02.sayHello();
    }

    public static void sayHelloWorldByMultiName() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld01 = beanFactory.getBean("bean1", HelloWorld.class);
        helloWorld01.sayHello();
        HelloWorld helloWorld02 = beanFactory.getBean("alias11", HelloWorld.class);
        helloWorld02.sayHello();
        HelloWorld helloWorld03 = beanFactory.getBean("alias12", HelloWorld.class);
        helloWorld03.sayHello();
        HelloWorld helloWorld04 = beanFactory.getBean("alias13", HelloWorld.class);
        helloWorld04.sayHello();
        HelloWorld helloWorld05 = beanFactory.getBean("bean2", HelloWorld.class);
        helloWorld05.sayHello();
        HelloWorld helloWorld06 = beanFactory.getBean("alias21", HelloWorld.class);
        helloWorld06.sayHello();
        HelloWorld helloWorld07 = beanFactory.getBean("alias22", HelloWorld.class);
        helloWorld07.sayHello();
        HelloWorld helloWorld08 = beanFactory.getBean("alias23", HelloWorld.class);
        helloWorld08.sayHello();
    }

    public static void sayHelloWorldByAlias() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld01 = beanFactory.getBean("alias31", HelloWorld.class);
        helloWorld01.sayHello();
        HelloWorld helloWorld02 = beanFactory.getBean("alias32", HelloWorld.class);
        helloWorld02.sayHello();
    }

    public static void sayHelloWithNoArgs() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-instance.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldWithNoArgs", HelloWorld.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWithArgs() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-instance.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldWithArgs", HelloWorld.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWithStaticFactory() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-instance.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldStaticFactory", HelloWorld.class);
        helloWorld.sayHello();
    }
    public static void sayHelloWithInstanceFactory() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-instance.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldInstance", HelloWorld.class);
        helloWorld.sayHello();
    }
}
