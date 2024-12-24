package com.springacademy.usermicroservices.services;

import com.springacademy.usermicroservices.models.Token;
import com.springacademy.usermicroservices.models.User;
import com.springacademy.usermicroservices.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImplementation implements UserService {


    private UserRepository userRepository;

    private BCryptPasswordEncoder PasswordEncoder;

    public UserServiceImplementation(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        PasswordEncoder = passwordEncoder;
    }


    @Override
    public Token login(String name, String password) {
        return null;
    }

    @Override
    public User signUp(String name, String password, String email) {


        Optional<User> optionalUser= userRepository.findByEmail(email);

        if(optionalUser.isPresent())
        {
            optionalUser.get();
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);

        user.setPassword(PasswordEncoder.encode(password));
        user.setVerified(true);

        return userRepository.save(user);


    }

    @Override
    public void Logout(String token) {

    }

    @Override
    public User validateToken(String token) {
        return null;
    }
}
