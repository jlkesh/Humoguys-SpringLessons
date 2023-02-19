package dev.jlkesh.lessons;


import org.springframework.beans.factory.annotation.Autowired;

public class AuthController {
    private AuthService authService;

    public AuthController() {
    }

    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public String toString() {
        return "AuthController{" +
                "authService=" + authService +
                '}';
    }
}
