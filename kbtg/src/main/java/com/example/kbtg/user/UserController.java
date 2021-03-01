package com.example.kbtg.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{userId}")
    public UserResponse getUserBy(
            @PathVariable("userId") int userId
    ) {
        return new UserResponse(
                Long.parseLong(String.format("%s", userId)),
                "papatpon",
                30L
        );
    }
}
