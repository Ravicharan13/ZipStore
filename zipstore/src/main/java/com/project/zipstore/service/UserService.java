package com.project.zipstore.service;

import com.project.zipstore.dto.RegisterRequest;
import com.project.zipstore.model.Users;
import com.project.zipstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Optional<Users> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    public Users registerUser(RegisterRequest request) {
        if(userRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Username already exists");
        }
        if(userRepository.existsByUsername(request.getUsername())){
            throw new RuntimeException("Email already exists");
        }
        Users user = Users.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole())
                .fullName(request.getFullName())
                .phone(request.getPhone())
                .address(request.getAddress())
                .isActive(true)
                .build();

        return userRepository.save(user);
    }
}
