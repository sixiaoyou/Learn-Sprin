package com.jike.spring.chapter;

import org.springframework.beans.BeanInfoFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;



public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Resource r = new FileSystemResource("helloMessage.xml");
        BeanFactory f = new XmlBeanFactory(r);
        Person person = (Person) f.getBean("person");
        String s = person.sayHello();
        System.out.println("The person is currently saying " + s);
           
    }

}
