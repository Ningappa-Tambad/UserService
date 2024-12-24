package com.springacademy.usermicroservices.services;

import com.springacademy.usermicroservices.models.Token;
import com.springacademy.usermicroservices.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService
{

    Token login(String name, String password);
    User signUp(String name, String password, String email);
    void Logout(String token);
    User validateToken(String token);
}
