package com.springacademy.usermicroservices.dtos;


import com.springacademy.usermicroservices.models.Role;
import com.springacademy.usermicroservices.models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private List<Role> roles;

    public static UserDto from(User user) {
   if (user==null)
   {
       return  null;
   }


        UserDto userDto=new UserDto();
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setRoles(user.getRoles());
        return userDto;


    }
}
