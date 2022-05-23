package com.baseurak.AwesomeGreat.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public /*Message*/void CreateUser(User user) {
        userService.CreateUser(user);

//        return message;
    }

    @GetMapping("/user")
    public List<User> readUsers(){
        return userService.readAllUsers();
    }
}
