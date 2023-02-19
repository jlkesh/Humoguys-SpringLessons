package dev.jlkesh.lessons;

public class FakeUserService implements UserService{
    void init() {
        System.out.println("FakeUserService bean constructed");
    }

    void destroy() {
        System.out.println("FakeUserService bean destroyed");
    }
}
