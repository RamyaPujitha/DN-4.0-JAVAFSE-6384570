package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserService(); // Arrange
        System.out.println("Setup: UserService instance initialized.");
    }

    @After
    public void tearDown() {
        userService = null;
        System.out.println("Teardown: UserService instance destroyed.");
    }

    @Test
    public void testIsValidUser_withValidUsername() {
        // Act
        boolean result = userService.isValidUser("Ramya");

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsValidUser_withEmptyUsername() {
        // Act
        boolean result = userService.isValidUser("  ");

        // Assert
        assertFalse(result);
    }

    @Test
    public void testGetNameLength_withNull() {
        // Act
        int length = userService.getNameLength(null);

        // Assert
        assertEquals(0, length);
    }

    @Test
    public void testGetNameLength_withValidName() {
        // Act
        int length = userService.getNameLength("Ramya");

        // Assert
        assertEquals(5, length);
    }
}
