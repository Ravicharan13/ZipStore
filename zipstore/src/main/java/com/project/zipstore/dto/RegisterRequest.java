package com.project.zipstore.dto;

import com.project.zipstore.model.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String email;
    private String password;
    private String fullName;
    private String phone;
    private String address;
    private Role role; // CUSTOMER, SELLER, ADMIN
}
