package dev.jlkesh.lessons;

import java.sql.SQLOutput;

public class User {
    private String username;
    private String email;

    private User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        System.out.println("Constructor Called By Spring Container");
        System.out.println(this);
    }


    private void init() {
        System.out.println("Bean Constructed");
    }

    private void destroy() {
        System.out.println("Bean Destroyed");
    }

    public static User getInstance() {
        return new User();
    }


    public void setUsername(String username) {
        System.out.println("Username setter called");
        this.username = username;
    }

    public void setEmail(String email) {
        System.out.println("Email setter called");
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
