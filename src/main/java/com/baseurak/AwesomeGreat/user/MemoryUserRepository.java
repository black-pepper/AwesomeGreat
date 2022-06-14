package com.baseurak.AwesomeGreat.user;

import com.baseurak.AwesomeGreat.post.Post;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryUserRepository implements UserRepository{

    private static Map<String, User> store = new HashMap<>();

    @Override
    public User findByUserId(String userId) {
        return store.get(userId);
    }

    @Override
    public User findByUserIdAndPassword(String userId, String password) {
        return null;
    }

    @Override
    public void deleteById(String userId) {
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        for (User value : store.values()) {
            users.add(value);
        }
        return users;
    }

    @Override
    public void save(User user) {
        store.put(user.getUserId(), user);
    }
}