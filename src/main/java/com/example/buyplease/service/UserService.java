package com.example.buyplease.service;

import com.example.buyplease.model.User;

import java.util.List;

public interface UserService {
    User getById(Long id);

    void save(User user);

    void delete(long id);

    List<User> getAll();
}
