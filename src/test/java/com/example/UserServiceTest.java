package com.example;

import com.example.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by metraf on 06.05.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void checkUserRepository() throws Exception{
        assertThat(userRepository).isNotNull();
    }
}
