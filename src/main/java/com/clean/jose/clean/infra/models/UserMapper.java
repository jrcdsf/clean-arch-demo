package com.clean.jose.clean.infra.models;

import com.clean.jose.clean.domain.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(User user){
        return new UserDto(user.getName(), user.getPassword());
    }

    public User toUser(UserDto userDto){
        return new User(userDto.getName(), userDto.getPassword());
    }
}
