package com.popcorn.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserServiceE2E {
    @Autowired
    private UserService userService;

    @Test
    void testGetCity() {
        assertEquals("Singapore", userService.getCity());
    }
}
