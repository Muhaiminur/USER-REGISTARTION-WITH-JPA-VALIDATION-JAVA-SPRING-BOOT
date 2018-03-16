package com.registration.service;

import com.registration.modal.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}