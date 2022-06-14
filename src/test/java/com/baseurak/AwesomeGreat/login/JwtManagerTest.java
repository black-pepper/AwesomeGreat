package com.baseurak.AwesomeGreat.login;

import com.baseurak.AwesomeGreat.user.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@DisplayName("JwtManger 테스트")
class JwtManagerTest {
    private JwtManager jwtManager;

    @BeforeEach
    void setUp() {
        jwtManager = new JwtManager();
    }

    @Test
    @DisplayName("토큰 생성 및 복호화 테스트")
    void tokenTest() {
        //given
        LocalDateTime now = LocalDateTime.now();
        final User user =
                User.builder()
                        .userId("hong01")
                        .password("1234")
                        .build();
        log.info("userId = {}", user.getId());
        // when
        // 1) 토큰 생성
        final String token = jwtManager.generateJwtToken(user);
        // 2) 토큰으로부터 username 가져오기
        String usernameFromToken = jwtManager.getUsernameFromToken(token);
        // then
        assertEquals("hong01", usernameFromToken); }
}

