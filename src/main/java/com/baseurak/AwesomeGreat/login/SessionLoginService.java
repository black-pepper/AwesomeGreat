package com.baseurak.AwesomeGreat.login;

import com.baseurak.AwesomeGreat.post.PostRepository;
import com.baseurak.AwesomeGreat.user.User;
import com.baseurak.AwesomeGreat.user.UserRepository;
import org.springframework.stereotype.Service;

//@Service
public class SessionLoginService {
    private UserRepository userRepository;

    public SessionLoginService(UserRepository memberRepository){ this.userRepository = memberRepository; }

    public User login(String loginId, String password) {
        /*
        Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
        Member member = findMemberOptional.get();
        if (member.getPassword().equals(password)) {
            return member;
        } else {
            return null;
        }*/
        return userRepository.findByUserId(loginId);
                //.filter(m -> m.getPassword().equals(password))
                //orElse(null);
    }
}
