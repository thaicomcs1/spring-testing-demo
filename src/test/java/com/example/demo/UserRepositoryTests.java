package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.RegisterUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.demo.custom.UserAssert.assertThat;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserRepositoryTests {

    @InjectMocks
    private UserRepository userRepository;

    @Test
    void saveUser() {
        // Given
        User user = new User("chang", "chang@g-able.com");

        // When
        userRepository.save(user);

        // Then
        assertThat(user).isNotNull();
    }

}