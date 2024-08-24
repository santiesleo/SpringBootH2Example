package com.example.springbooth2example;

import com.example.springbooth2example.model.User;
import com.example.springbooth2example.services.interfaces.IUserDao;
import com.example.springbooth2example.services.interfaces.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootH2ExampleApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("testUser");
        user.setEmail("testUser@email.com");
        user.setName("User");
        user.setLastName("Test");
        userService.saveUser(user);
    }

}
