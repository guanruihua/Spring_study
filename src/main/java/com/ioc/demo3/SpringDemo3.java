package com.ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用范围的测试
 */
public class SpringDemo3 {
    @Test
    public  void demo1(){
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = (Person)applicationContext.getBean("person");
        Person person2 = (Person)applicationContext.getBean("person");

        System.out.println(person1);
        System.out.println(person2);
    }
    @Test
    public void demo2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = (Man)applicationContext.getBean("man");
        man.run();
        //        System.out.println(man);
        applicationContext.close();//销毁事件
    }
}
