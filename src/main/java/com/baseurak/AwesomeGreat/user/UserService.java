package com.baseurak.AwesomeGreat.user;

import com.baseurak.AwesomeGreat.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserService  {
    @Autowired
    private UserRepository userRepository;

    public User findUser(User user){ return userRepository.findByUserId(user.getId()); }

    public void CreateUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(String userId) { userRepository.deleteById(userId); }

//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException { // 시큐리티에서 지정한 서비스이기 때문에 이 메소드를 필수로 구현
//        return userRepository.findByEmail(email)
//                .orElseThrow(() -> new UsernameNotFoundException((email)));
//    }

    public List<User> readAllUsers() {
        return userRepository.findAll();
    }
}
