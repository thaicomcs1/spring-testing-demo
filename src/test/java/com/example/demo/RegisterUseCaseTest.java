package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.RegisterUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RegisterUseCaseTest {

    @Mock
    private UserRepository userRepository;

    private RegisterUseCase registerUseCase;

    @BeforeEach
    void initUseCase() {
        registerUseCase = new RegisterUseCase(userRepository);
    }

    @Test
    void savedUserHasRegistrationDate() {
        User user = new User("chang", "chang@g-able.com");
        when(userRepository.save(any(User.class))).then(returnsFirstArg());
        User savedUser = registerUseCase.registerUser(user);
        assertThat(savedUser.getRegistrationDate()).isNotNull();
    }

}