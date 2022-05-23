package com.baseurak.AwesomeGreat.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//import javax.persistence.*;

@Data
@AllArgsConstructor
//@Entity
public class User {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String userId;
    private String password;
    private UserRole roll;

    @Builder
    public User(String userId, String password){
        this.userId = userId;
        this.password = password;
    }
}
