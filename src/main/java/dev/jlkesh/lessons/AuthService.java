package dev.jlkesh.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthService {
    private final AuthRepo authRepo;

    @Autowired
    public AuthService(AuthRepo authRepo) {
        this.authRepo = authRepo;
    }
}

