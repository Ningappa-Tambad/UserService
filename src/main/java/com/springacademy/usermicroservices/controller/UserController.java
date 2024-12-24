package com.springacademy.usermicroservices.controller;


import com.springacademy.usermicroservices.dtos.LoginRequestDto;
import com.springacademy.usermicroservices.dtos.LogoutRequestDto;
import com.springacademy.usermicroservices.dtos.SignUpRequestDto;
import com.springacademy.usermicroservices.dtos.UserDto;
import com.springacademy.usermicroservices.models.Token;
import com.springacademy.usermicroservices.models.User;
import com.springacademy.usermicroservices.services.UserService;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

private UserService userService;
    @PostMapping("/login")
    public Token login(@RequestBody LoginRequestDto loginRequestDto)
    {
        return null;
    }

    @PostMapping("/signup")
    public UserDto signUp(@RequestBody SignUpRequestDto signUpRequestDto)
    {
        User user=userService.signUp(
                signUpRequestDto.getName()
                ,signUpRequestDto.getEmail(),
                signUpRequestDto.getPassword());
        return UserDto.from(user);
    }

    @GetMapping("/logout")
    public ResponseEntity<Void> logout(LogoutRequestDto logoutRequestDto)
    {
          return null;
    }

    @GetMapping("/validateToken")
    public UserDto validateToken(String token)
    {
          return null;
    }
}
