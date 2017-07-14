package com.jike.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        testCGlib();
//        testAspect();
        testXml();
        
        
    }
    
    private static void testAop(){
        StudentInterface s1 = new StudentBean();
        ProxyFactory factory = new ProxyFactory();
        StudentInterface s2 = (StudentInterface) factory.createStudentProxy(s1);
        s2.print();
    }
    
    private static void testCGlib(){
        StudentBean s1 = (StudentBean)(new CGLibProxyFactory()).createStudent(new StudentBean("test"));
        StudentBean s2 = (StudentBean)(new CGLibProxyFactory()).createStudent(new StudentBean());
        s1.print();
        s2.print();
    }
    
    private static void testAspect(){
      ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/conf-aspect.xml");
      Student stu = (Student) ctx.getBean("stu");
      stu.print("whc");
    }
    
    private static void testXml(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/conf-xml.xml");
        Student stu = (Student) ctx.getBean("stu");
        stu.print("whc");
    }
}
