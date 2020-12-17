package com.example.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setUp() {

        String name = "suepsakun";
        String surname = "aiamlaoo";

        user = new User();
        user.setName(name);
        user.setSurname(surname);
    }

    @Test
    void getName() {

        // When
        String expected = "suepsakun";
        String actual = user.getName();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void getSurname() {

        // When
        String expected = "aiamlaoo";
        String actual = user.getSurname();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void getFullName() {

        // When
        String expected = "suepsakun aiamlaoo";
        String actual = user.getFullName();

        // Then
        assertEquals(expected, actual);
    }

}