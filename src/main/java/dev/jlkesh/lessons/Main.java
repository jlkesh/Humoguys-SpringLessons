package dev.jlkesh.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationSettings.xml");
        System.out.println(context.getBean("manager", Manager.class));
    }
}
