package dev.jlkesh.lessons;

public class DBUserService implements UserService {
    void init() {
        System.out.println("DBUserService bean constructed");
    }

    void destroy() {
        System.out.println("DBUserService bean destroyed");
    }
}
