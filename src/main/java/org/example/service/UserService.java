package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    User getUser(String id);
    List<User> findAllUsers();

}
