package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}