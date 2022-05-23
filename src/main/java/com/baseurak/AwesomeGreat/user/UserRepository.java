package com.baseurak.AwesomeGreat.user;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface UserRepository //extends JpaRepository<User, String>
{
    User findByUserId(String userId);
    User findByUserIdAndPassword(String userId, String password);
    void deleteById(String userId);
    List<User> findAll();
    void save(User user);

    Optional<User> findByEmail(String email);
}
