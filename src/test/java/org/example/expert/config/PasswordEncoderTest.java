package org.example.expert.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
class PasswordEncoderTest {

    @InjectMocks
    private PasswordEncoder passwordEncoder;

    @Test
    void matches_메서드가_정상적으로_동작한다() {
        // given
        String rawPassword = "testPassword";
        String encodedPassword = passwordEncoder.encode(rawPassword);

        // when
        // public boolean matches(String rawPassword, String encodedPassword){...}
        // matches 메서드의 변수가 String rawPassword, String encodedPassword 이므로
        //(encodedPassword, rawPassword) -> (rawPassword, encodedPassword)

        // boolean matches = passwordEncoder.matches(encodedPassword, rawPassword);
        boolean matches = passwordEncoder.matches(rawPassword, encodedPassword);


        // then
        assertTrue(matches);
    }
}
