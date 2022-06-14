package com.baseurak.AwesomeGreat.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public /*Message*/void createUser(User user) {
        log.info("ID:{} PASSWORD:{}", user.getId(), user.getPassword());
        userService.createUser(user);

//        return message;
    }

    @GetMapping("/user")
    public List<User> readUsers(){
        return userService.readAllUsers();
    }
}
