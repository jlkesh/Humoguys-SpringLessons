package dev.jlkesh.lessons;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


public class Manager {

    @Value("${name3:Elmurodov Javohir}")
    private String name;
    @Value("${age}")
    private int age;

    @PostConstruct
    void init() {
        System.out.println("Manager init method called");
    }

    @PreDestroy
    void destroy(){
        System.out.println("Manager destroy method called");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
