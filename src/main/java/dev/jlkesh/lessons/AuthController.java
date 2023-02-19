package dev.jlkesh.lessons;


import org.springframework.beans.factory.annotation.Autowired;

public class AuthController {
    private final AuthService authService;


    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }
}
