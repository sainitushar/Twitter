package com.project.twitter.web.service;

import com.project.twitter.web.model.User;
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}