package org.example.service.impl;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return List.of();
    }
}
