package com.project.zipstore.dto;

import com.project.zipstore.model.Role;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {
    private Long id;
    private String username;
    private String email;
    private Role role;
    private String fullName;
}
