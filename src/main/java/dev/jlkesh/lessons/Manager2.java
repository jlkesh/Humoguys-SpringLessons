package dev.jlkesh.lessons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

 
public class Manager2 {

    @Value("${name3:Elmurodov Javohir}")
    private String name;
    @Value("${age}")
    private int age;

    void init() {
        System.out.println("Manager init method called");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager2{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
