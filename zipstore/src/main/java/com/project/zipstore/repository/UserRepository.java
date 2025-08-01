package com.project.zipstore.repository;

import com.project.zipstore.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public
interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}
