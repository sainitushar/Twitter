package com.project.twitter.web.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}

