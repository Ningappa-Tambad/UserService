package com.springacademy.usermicroservices.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutRequestDto
{
    private String tokenValue;
}
