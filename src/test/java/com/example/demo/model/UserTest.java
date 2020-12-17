package com.example.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    // Test target
    User user;

    // Setup target
    @BeforeEach
    void setUp() {
        user = new User();
        user.setName("suepsakun");
        user.setSurname("aiamlaoo");
    }

    // Test case 1
    @Test
    void getName() {

        // When
        String expected = "suepsakun";
        String actual = user.getName();

        // Then
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void getSurname() {

        // When
        String expected = "aiamlaoo";
        String actual = user.getSurname();

        // Then
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void getFullName() {

        // When
        String expected = "suepsakun aiamlaoo";
        String actual = user.getFullName();

        // Then
        assertEquals(expected, actual);
    }

}