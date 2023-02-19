package dev.jlkesh.lessons;

import org.springframework.stereotype.Component;

@Component
public class Manager {
    private String name;
    private String age;

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
