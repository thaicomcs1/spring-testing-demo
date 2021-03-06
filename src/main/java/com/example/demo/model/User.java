package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private LocalDateTime registrationDate;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {

    }

    public String getFullName () {
        return name+" "+surname;
    }
}